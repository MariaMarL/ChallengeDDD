package com.sofka.challenge.client.UseCases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import com.sofka.challenge.client.commands.DefineVehicle;
import com.sofka.challenge.client.events.ClientCreated;
import com.sofka.challenge.client.events.VehicleDefined;
import com.sofka.challenge.client.values.*;
import com.sofka.challenge.sale.commands.CreateEstimate;
import com.sofka.challenge.sale.events.EstimateCreated;
import com.sofka.challenge.sale.events.SaleCreated;
import com.sofka.challenge.sale.usecases.CreateEstimateUseCase;
import com.sofka.challenge.sale.values.EstimateId;
import com.sofka.challenge.sale.values.Name;
import com.sofka.challenge.sale.values.SaleId;
import com.sofka.challenge.sale.values.Value;
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
class DefineVehicleUseCaseTest {

    private final String ROOT_ID="1";  //Id del agregado

    @Mock
    private DomainEventRepository repository;
    @Test
    void defineVehicle(){
        var command = new DefineVehicle(new Brand(Brand.BrandOptions.AGILITY2),
                      new Color(Color.ColorOptions.DARK_BLACK), VehicleId.of("3"), ClientId.of(ROOT_ID));
        var useCase = new DefineVehicleUseCase();
        Mockito.when(repository.getEventsBy(ROOT_ID)).thenReturn(List.of(
                new ClientCreated(new Budget(200000L), ClientId.of("3"))
        ));
        useCase.addRepository(repository);

        var events = UseCaseHandler.getInstance().setIdentifyExecutor(ROOT_ID)
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow(()->new IllegalArgumentException("Something went wrong"))
                .getDomainEvents();

        var event = (VehicleDefined)events.get(0);
        Assertions.assertEquals(command.color().value(), event.color().value());
        Assertions.assertEquals(command.brand().value(),event.brand().value());

    }}