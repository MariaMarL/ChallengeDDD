package com.sofka.challenge.sale.usecases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import com.sofka.challenge.sale.commands.CancelTracking;
import com.sofka.challenge.sale.commands.UpdateEstimate;
import com.sofka.challenge.sale.events.*;
import com.sofka.challenge.sale.values.*;
import com.sofka.challenge.share.values.Date;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class CancelTrackingUseCaseTest {

    private final String ROOT_ID="1";  //Id del agregado

    @Mock
    private DomainEventRepository repository;
    @Test
    void cancelTracking(){
        var command = new CancelTracking(SaleId.of(ROOT_ID));
    //    var command = new UpdateEstimate(new Date("15-04-2021"), new Value(2000.0), EstimateId.of("2"), SaleId.of(ROOT_ID));
        var useCase = new CancelTrackingUseCase();
        Mockito.when(repository.getEventsBy(ROOT_ID)).thenReturn(List.of(
                new SaleCreated(SaleId.of("2"),new Name("Fernanda")),
                new TrackingProgramed(new Date("01-01-2021"), new StatusTracking(StatusTracking.Option.CANCEL), TrackingId.of("2"))
               //new EstimateCreated(EstimateId.of("2"),new Date("01-01-2021"),new Value(1000.0))

        ));
        useCase.addRepository(repository);

        var events = UseCaseHandler.getInstance().setIdentifyExecutor(ROOT_ID)
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow(()->new IllegalArgumentException("Something went wrong"))
                .getDomainEvents();

        var event = (TrackingCanceled)events.get(0);

    }}