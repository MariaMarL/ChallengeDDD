package com.sofka.challenge.assessor.commands;

import com.sofka.challenge.assessor.values.AssessorId;
import com.sofka.challenge.assessor.values.EstimateId;
import com.sofka.challenge.assessor.values.Value;
import com.sofka.challenge.share.values.Date;

public class UpdateEstimate {
    private final Date date;
    private final Value value;
    private final EstimateId estimateId;
    private final AssessorId assessorId;


    public UpdateEstimate(Date date, Value value, EstimateId estimateId, AssessorId assessorId) {
        this.date = date;
        this.value = value;
        this.estimateId = estimateId;
        this.assessorId = assessorId;
    }

    public Date date() {
        return date;
    }

    public Value value() {
        return value;
    }

    public EstimateId estimateId() {
        return estimateId;
    }

    public AssessorId assessorId() {
        return assessorId;
    }
}
