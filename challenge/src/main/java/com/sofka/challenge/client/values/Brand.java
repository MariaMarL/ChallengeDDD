package com.sofka.challenge.client.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Brand implements ValueObject<Brand.BrandOptions> {

    private final Brand.BrandOptions value;

    public Brand(BrandOptions value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public BrandOptions value() {
        return this.value;
    }

    public enum BrandOptions {
        AGILITY2, AGILITY3, CX3, CX4, FORCE2, FORCE3
    }
}
