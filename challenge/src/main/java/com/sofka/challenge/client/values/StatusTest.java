package com.sofka.challenge.client.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class StatusTest implements ValueObject<StatusTest.Status> {
    private final StatusTest.Status value;

    public StatusTest(Status value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public Status value() {
        return this.value;
    }

    public enum Status {
        PROGRAMMED, CANCELED, DONE
    }
}
