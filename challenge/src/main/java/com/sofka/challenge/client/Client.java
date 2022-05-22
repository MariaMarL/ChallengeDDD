package com.sofka.challenge.client;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.challenge.client.entities.Register;
import com.sofka.challenge.client.entities.TestDrive;
import com.sofka.challenge.client.entities.Vehicle;
import com.sofka.challenge.client.events.*;
import com.sofka.challenge.client.values.*;
import com.sofka.challenge.share.values.Date;

import java.util.List;

public class Client extends AggregateEvent<ClientId> {

    protected Register register;
    protected TestDrive testDrive;
    protected Vehicle vehicle;
    protected Budget budget;

    public Client(ClientId entityId, Budget budget) {
        super(entityId);
        appendChange(new ClientCreated(budget, entityId)).apply();
    }

    private Client(ClientId clientId){
        super(clientId);
        subscribe(new ClientChanger(this));
    }

    public static Client from(ClientId clientId, List<DomainEvent> events){
        Client client = new Client(clientId);
        events.forEach((event)-> client.applyEvent(event));
        return client;
    }

    //behaviors

    public void defineVehicle(Brand brand, Color color){
        VehicleId vehicleId = new VehicleId();
        appendChange(new VehicleDefined(brand,color, vehicleId));
    }

    public void updateBrandVehicle(Brand brand){
        appendChange(new BrandVehicleUpdated(brand)).apply();
    }

    public void registerClient(Cc cc, Name name){
        RegisterId registerId = new RegisterId();
        appendChange(new ClientRegistered(name, cc, registerId)).apply();
    }

    public void updateCcClient(Cc cc){
        appendChange(new CcClientUpdated(cc)).apply();
    }

    public void UpdateColorVehicle(Color color){
        appendChange(new ColorVehicleUpdated(color)).apply();
    }

    public void updateNameClient(Name name){
        appendChange(new NameClientUpdated(name)).apply();
    }

    public void programTestDrive(Date date, StatusTest statusTest){
        TestId testId = new TestId();
        appendChange(new TestDriveProgramed(date, statusTest, testId)).apply();
    }

    public void cancelTestDrive(StatusTest statusTest){
        appendChange(new TestDriveCanceled(statusTest)).apply();
    }

    //getters
    public Register register() {
        return register;
    }

    public TestDrive testDrive() {
        return testDrive;
    }

    public Vehicle vehicle() {
        return vehicle;
    }

    public Budget getBudget() {
        return budget;
    }
}
