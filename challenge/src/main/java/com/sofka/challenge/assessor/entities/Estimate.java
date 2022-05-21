package com.sofka.challenge.assessor.entities;

import co.com.sofka.domain.generic.Entity;
import com.sofka.challenge.assessor.values.EstimateId;
import com.sofka.challenge.assessor.values.Value;
import com.sofka.challenge.share.values.Date;

import java.util.Objects;

public class Estimate extends Entity<EstimateId> {
    private Date date;
    private Value value;


    public Estimate(EstimateId entityId, Date date, Value value) {
        super(entityId);
        this.date = date;
        this.value = value;
    }

    public void createEstimate(Date date, Value value) {
        this.date = Objects.requireNonNull(date);
        this.value = Objects.requireNonNull(value);
    }

    public void updateEstimate(Date date, Value value) {
        this.date = Objects.requireNonNull(date);
        this.value = Objects.requireNonNull(value);
    }

    public Date date() {
        return date;
    }

    public Value value() {
        return value;
    }
}
