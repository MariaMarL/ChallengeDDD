package com.sofka.challenge.client.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.challenge.client.values.ClientId;
import com.sofka.challenge.client.values.Color;

public class UpdateColorVehicle extends Command {

    private final Color color;
    private final ClientId client;


    public UpdateColorVehicle(Color color, ClientId client) {
        this.color = color;
        this.client = client;
    }

    public Color color() {
        return color;
    }

    public ClientId client() {
        return client;
    }
}
