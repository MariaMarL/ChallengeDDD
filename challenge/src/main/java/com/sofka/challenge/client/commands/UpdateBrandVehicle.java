package com.sofka.challenge.client.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.challenge.client.values.Brand;

public class UpdateBrandVehicle extends Command {

    private final Brand brand;


    public UpdateBrandVehicle(Brand brand) {
        this.brand = brand;
    }

    public Brand brand() {
        return brand;
    }
}
