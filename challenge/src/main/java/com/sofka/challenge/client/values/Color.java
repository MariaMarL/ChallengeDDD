package com.sofka.challenge.client.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Color implements ValueObject<EnumColor> {

    public final EnumColor value;


    public Color(EnumColor value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public EnumColor value() {
        return this.value;
    }
}
