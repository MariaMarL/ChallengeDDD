package com.sofka.challenge.client.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.challenge.client.values.Brand;
import com.sofka.challenge.client.values.Color;
import com.sofka.challenge.client.values.VehicleId;

public class VehicleDefined extends DomainEvent {

    private final Brand brand;
    private final Color color;
    private final VehicleId vehicleId;


    public VehicleDefined(Brand brand, Color color, VehicleId vehicleId) {
        super("sokfa.client.vehicledefined");
        this.brand = brand;
        this.color = color;
        this.vehicleId = vehicleId;
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
}
