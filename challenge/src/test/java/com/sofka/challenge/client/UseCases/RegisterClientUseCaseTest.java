package com.sofka.challenge.client.UseCases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import com.sofka.challenge.client.commands.DefineVehicle;
import com.sofka.challenge.client.commands.RegisterClient;
import com.sofka.challenge.client.events.ClientCreated;
import com.sofka.challenge.client.events.ClientRegistered;
import com.sofka.challenge.client.events.VehicleDefined;
import com.sofka.challenge.client.values.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class RegisterClientUseCaseTest {

    private final String ROOT_ID="1";  //Id del agregado

    @Mock
    private DomainEventRepository repository;
    @Test
    void registerClient() {
        var command = new RegisterClient(new Name("Maria"), new Cc(10756543234L),
                RegisterId.of("6"), ClientId.of(ROOT_ID));
        var useCase = new RegisterClientUseCase();
        Mockito.when(repository.getEventsBy(ROOT_ID)).thenReturn(List.of(
                new ClientRegistered(new Name("Maria"), new Cc(1087234234L),
                        RegisterId.of("5"))));

        useCase.addRepository(repository);

        var events = UseCaseHandler.getInstance().setIdentifyExecutor(ROOT_ID)
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow(() -> new IllegalArgumentException("Something went wrong"))
                .getDomainEvents();

        var event = (ClientRegistered) events.get(0);
        Assertions.assertEquals(command.name().value(), event.name().value());
        Assertions.assertEquals(command.cc().value(), event.cc().value());
    }};