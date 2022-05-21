package com.sofka.challenge.assessor.commands;

import com.sofka.challenge.assessor.values.AssessorId;
import com.sofka.challenge.assessor.values.StatusTracking;

public class CancelTracking {
    private final StatusTracking statusTracking;
    private final AssessorId assessorId;

    public CancelTracking(StatusTracking statusTracking, AssessorId assessorId) {
        this.statusTracking = statusTracking;
        this.assessorId = assessorId;
    }

    public StatusTracking statusTracking() {
        return statusTracking;
    }

    public AssessorId assessorId() {
        return assessorId;
    }
}
