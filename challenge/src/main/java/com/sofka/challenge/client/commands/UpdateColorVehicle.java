package com.sofka.challenge.client.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.challenge.client.values.Color;

public class UpdateColorVehicle extends Command {

    private final Color color;


    public UpdateColorVehicle(Color color) {
        this.color = color;
    }

    public Color color() {
        return color;
    }
}
