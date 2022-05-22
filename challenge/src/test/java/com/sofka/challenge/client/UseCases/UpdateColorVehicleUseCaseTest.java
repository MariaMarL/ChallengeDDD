package com.sofka.challenge.client.UseCases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import com.sofka.challenge.client.commands.UpdateBrandVehicle;
import com.sofka.challenge.client.commands.UpdateColorVehicle;
import com.sofka.challenge.client.events.BrandVehicleUpdated;
import com.sofka.challenge.client.events.ClientCreated;
import com.sofka.challenge.client.events.ColorVehicleUpdated;
import com.sofka.challenge.client.events.VehicleDefined;
import com.sofka.challenge.client.values.*;
import com.sofka.challenge.sale.events.SaleCreated;
import com.sofka.challenge.sale.values.Name;
import com.sofka.challenge.sale.values.SaleId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class UpdateColorVehicleUseCaseTest {

    private final String ROOT_ID="1";  //Id del agregado

    @Mock
    private DomainEventRepository repository;
    @Test
    void updateBrandVehicle() {
        var command = new UpdateColorVehicle(new Color(Color.ColorOptions.RUBY), ClientId.of(ROOT_ID));
        var useCase = new UpdateColorVehicleUseCase();
        Mockito.when(repository.getEventsBy(ROOT_ID)).thenReturn(List.of(
                new ClientCreated(new Budget(200000L),ClientId.of(ROOT_ID)),
                new SaleCreated(SaleId.of("2"), new Name("Fernanda")),
                new VehicleDefined(new Brand(Brand.BrandOptions.CX4),new Color(Color.ColorOptions.DARK_BLACK), VehicleId.of("5"))

        ));
        useCase.addRepository(repository);

        var events = UseCaseHandler.getInstance().setIdentifyExecutor(ROOT_ID)
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow(() -> new IllegalArgumentException("Something went wrong"))
                .getDomainEvents();

        var event = (ColorVehicleUpdated) events.get(0);
        Assertions.assertEquals(command.color().value(), event.color().value());

    }}