package com.sofka.challenge.client.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Cc implements ValueObject<Long> {

    private final Long value;

    public Cc(Long value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public Long value() {
        return this.value;
    }
}
