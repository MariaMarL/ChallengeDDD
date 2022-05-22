package com.sofka.challenge.client.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.challenge.client.values.ClientId;
import com.sofka.challenge.client.values.Color;

public class UpdateColorVehicle extends Command {

    private final Color color;
    private final ClientId clientId;


    public UpdateColorVehicle(Color color, ClientId clientId) {
        this.color = color;
        this.clientId = clientId;
    }

    public Color color() {
        return color;
    }

    public ClientId clientId() {
        return clientId;
    }
}
