package com.sofka.challenge.client.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Name implements ValueObject<String> {

    private final String value;


    public Name(String value) {
        this.value = Objects.requireNonNull(value, "It can't be an empty name");
    }

    @Override
    public String value() {
        return this.value;
    }
}
