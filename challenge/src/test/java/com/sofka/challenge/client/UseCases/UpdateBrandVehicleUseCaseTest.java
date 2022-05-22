package com.sofka.challenge.client.UseCases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import com.sofka.challenge.client.commands.UpdateBrandVehicle;
import com.sofka.challenge.client.events.BrandVehicleUpdated;
import com.sofka.challenge.client.events.ClientCreated;
import com.sofka.challenge.client.events.VehicleDefined;
import com.sofka.challenge.client.values.*;
import com.sofka.challenge.sale.events.EstimateCreated;
import com.sofka.challenge.sale.events.SaleCreated;
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
class UpdateBrandVehicleUseCaseTest {

    private final String ROOT_ID="1";  //Id del agregado

    @Mock
    private DomainEventRepository repository;
    @Test
    void updateBrandVehicle() {
        var command = new UpdateBrandVehicle(new Brand(Brand.BrandOptions.CX4), ClientId.of(ROOT_ID));
        var useCase = new UpdateBrandVehicleUseCase();
        Mockito.when(repository.getEventsBy(ROOT_ID)).thenReturn(List.of(
                new ClientCreated(new Budget(200000L),ClientId.of(ROOT_ID)),
                new SaleCreated(SaleId.of("2"), new Name("Fernanda")),
                new VehicleDefined(new Brand(Brand.BrandOptions.CX4),new Color(Color.ColorOptions.RUBY), VehicleId.of("5"))

        ));
        useCase.addRepository(repository);

        var events = UseCaseHandler.getInstance().setIdentifyExecutor(ROOT_ID)
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow(() -> new IllegalArgumentException("Something went wrong"))
                .getDomainEvents();

        var event = (BrandVehicleUpdated) events.get(0);
        Assertions.assertEquals(command.brand().value(), event.brand().value());

    }}