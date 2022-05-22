package com.sofka.challenge.sale.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Value implements ValueObject<Double> {

    private final Double value;

    public Value(Double value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public Double value() {
        return value;
    }
}
