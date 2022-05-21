package com.sofka.challenge.assessor.commands;

import com.sofka.challenge.assessor.values.StatusTracking;

public class CancelTracking {
    private final StatusTracking statusTracking;

    public CancelTracking(StatusTracking statusTracking) {
        this.statusTracking = statusTracking;
    }

    public StatusTracking statusTracking() {
        return statusTracking;
    }
}
