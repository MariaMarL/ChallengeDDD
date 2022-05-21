package com.sofka.challenge.client.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.challenge.client.values.Color;

public class ColorVehicleUpdated extends DomainEvent {

    private final Color color;


    public ColorVehicleUpdated(Color color) {
        super("sofka.client.colorvehicleupdated");
        this.color = color;
    }

    public Color color() {
        return color;
    }
}
