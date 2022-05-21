package com.sofka.challenge.client.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Brand implements ValueObject<EnumBrands> {

    private final EnumBrands value;

    public Brand(EnumBrands value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public EnumBrands value() {
        return this.value;
    }
}
