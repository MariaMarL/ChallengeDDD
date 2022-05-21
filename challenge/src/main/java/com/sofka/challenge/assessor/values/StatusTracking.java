package com.sofka.challenge.assessor.values;

import co.com.sofka.domain.generic.ValueObject;
import com.sofka.challenge.client.values.EnumOption;

import java.util.Objects;

public class StatusTracking implements ValueObject<EnumOption> {

    public final EnumOption value;


    public StatusTracking(EnumOption value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public EnumOption value() {
        return this.value;
    }
}
