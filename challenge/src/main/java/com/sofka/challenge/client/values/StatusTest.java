package com.sofka.challenge.client.values;

import co.com.sofka.domain.generic.ValueObject;
import com.sofka.challenge.client.values.EnumOption;

import java.util.Objects;

public class StatusTest implements ValueObject<EnumOption> {
    private final EnumOption value;

    public StatusTest(EnumOption value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public EnumOption value() {
        return this.value;
    }
}
