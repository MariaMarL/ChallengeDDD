package com.sofka.challenge.client.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.challenge.client.values.Brand;
import com.sofka.challenge.client.values.ClientId;

public class UpdateBrandVehicle extends Command {

    private final Brand brand;
    private final ClientId client;


    public UpdateBrandVehicle(Brand brand, ClientId client) {
        this.brand = brand;
        this.client = client;
    }

    public Brand brand() {
        return brand;
    }

    public ClientId client() {
        return client;
    }
}
