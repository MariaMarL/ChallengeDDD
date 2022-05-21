package com.sofka.challenge.share.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Date extends ValueObject<String> {

    private final String value;


    public Date(String value) {
        this.value = Objects.requireNonNull(value, "It can't be an empty date");
    }

    @Override
    public String value() {
        return this.value;
    }
}
