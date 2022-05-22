package com.sofka.challenge.client.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.challenge.client.values.Brand;
import com.sofka.challenge.client.values.ClientId;
import com.sofka.challenge.client.values.Color;
import com.sofka.challenge.client.values.VehicleId;

public class DefineVehicle extends Command {


    private final Brand brand;
    private final Color color;
    private final VehicleId vehicleId;
    private final ClientId clientId;

    public DefineVehicle(Brand brand, Color color, VehicleId vehicleId, ClientId clientId) {
        this.brand = brand;
        this.color = color;
        this.vehicleId = vehicleId;
        this.clientId = clientId;
    }

    public Brand brand() {
        return brand;
    }

    public Color color() {
        return color;
    }

    public VehicleId vehicleId() {
        return vehicleId;
    }

    public ClientId clientId() {
        return clientId;
    }
}
