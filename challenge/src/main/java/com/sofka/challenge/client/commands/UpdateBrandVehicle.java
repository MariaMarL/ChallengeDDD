package com.sofka.challenge.client.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.challenge.client.values.Brand;
import com.sofka.challenge.client.values.ClientId;

public class UpdateBrandVehicle extends Command {

    private final Brand brand;
    private final ClientId clientId;


    public UpdateBrandVehicle(Brand brand, ClientId clientId) {
        this.brand = brand;
        this.clientId = clientId;
    }

    public Brand brand() {
        return brand;
    }

    public ClientId clientId() {
        return clientId;
    }
}
