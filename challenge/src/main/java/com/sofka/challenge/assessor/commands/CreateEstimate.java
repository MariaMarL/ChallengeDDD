package com.sofka.challenge.assessor.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.challenge.assessor.values.EstimateId;
import com.sofka.challenge.assessor.values.Value;
import com.sofka.challenge.share.values.Date;

public class CreateEstimate extends Command {
    private final Date date;
    private final Value value;
    private final EstimateId estimateId;


    public CreateEstimate(String type, Date date, Value value, EstimateId estimateId) {
        this.date = date;
        this.value = value;
        this.estimateId = estimateId;
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
}
