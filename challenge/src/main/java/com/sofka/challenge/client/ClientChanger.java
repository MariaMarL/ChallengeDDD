package com.sofka.challenge.client;

import co.com.sofka.domain.generic.EventChange;
import com.sofka.challenge.client.entities.Register;
import com.sofka.challenge.client.entities.TestDrive;
import com.sofka.challenge.client.entities.Vehicle;
import com.sofka.challenge.client.events.*;
import com.sofka.challenge.client.values.ClientId;

public class ClientChanger extends EventChange {

    public ClientChanger(Client client){
        apply((ClientCreated event)->{
            client.budget = event.budget();
        });

        //create

        apply((VehicleDefined event)->{
            Vehicle vehicle = new Vehicle(event.vehicleId(),event.brand(), event.color());
            client.vehicle = vehicle;
        });

        apply((BrandVehicleUpdated event)->{
            client.vehicle().updateBrandVehicle(event.brand());
        });

        apply((ClientRegistered event)->{
            Register register = new Register(event.registerId(), event.name(), event.cc());
            client.register =register;
        });

        apply((CcClientUpdated event)->{
           client.register().updateCcClient(event.cc());
        });

        apply((ColorVehicleUpdated event)->{
            client.vehicle().UpdateColorVehicle(event.color());
        });

        apply((NameClientUpdated event)->{
            client.register().updateNameClient(event.name());
        });

        apply((TestDriveProgramed event)->{
            TestDrive testDrive = new TestDrive(event.testId(),event.date(),event.statusTest());
        });

        apply((TestDriveCanceled event)->{
            client.testDrive.cancelTestDrive(event.statusTest());
        });

    }
}
