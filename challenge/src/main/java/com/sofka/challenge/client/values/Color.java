package com.sofka.challenge.client.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Color implements ValueObject<Color.ColorOptions> {

    public final Color.ColorOptions value;


    public Color(ColorOptions value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public ColorOptions value() {
        return this.value;
    }

    public enum ColorOptions {
        SILVER, RUBY, WHITE_PERL, DARK_BLACK, DEEP_BLUE
    }
}
