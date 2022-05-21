package com.sofka.challenge.client.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.challenge.client.values.Brand;

public class BrandVehicleUpdated extends DomainEvent {

    private final Brand brand;


    public BrandVehicleUpdated(Brand brand) {
        super("sofka.client.brandvehicleupdated");
        this.brand = brand;
    }

    public Brand brand() {
        return brand;
    }
}
