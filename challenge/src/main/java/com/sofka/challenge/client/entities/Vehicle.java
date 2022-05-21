package com.sofka.challenge.client.entities;

import co.com.sofka.domain.generic.Entity;
import com.sofka.challenge.client.values.Brand;
import com.sofka.challenge.client.values.Color;
import com.sofka.challenge.client.values.VehicleId;

import java.util.Objects;

public class Vehicle extends Entity<VehicleId> {

    private Brand brand;
    private Color color;

    public Vehicle(VehicleId entityId, Brand brand, Color color) {
        super(entityId);
        this.brand = brand;
        this.color = color;
    }

    public void defineVehicle(Brand brand, Color color) {
        this.brand = Objects.requireNonNull(brand, "Choose a brand");
        this.color = Objects.requireNonNull(color, "you have to choose a color");

    }

    public void updateBrandVehicle(Brand brand){
        this.brand = Objects.requireNonNull(brand, "Choose a brand");

    }

    public void UpdateColorVehicle(Color color){
        this.color = Objects.requireNonNull(color, "you have to choose a color");
    }

    public Brand brand() {
        return brand;
    }

    public Color color() {
        return color;
    }
}
