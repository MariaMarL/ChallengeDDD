package com.sofka.challenge.sale.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.challenge.sale.values.SaleId;
import com.sofka.challenge.sale.values.EstimateId;
import com.sofka.challenge.sale.values.Value;
import com.sofka.challenge.share.values.Date;

public class CreateEstimate extends Command {
    private final Date date;
    private final Value value;
    private final EstimateId estimateId;
    private final SaleId saleId;


    public CreateEstimate(Date date, Value value, EstimateId estimateId, SaleId saleId) {
        this.date = date;
        this.value = value;
        this.estimateId = estimateId;
        this.saleId = saleId;
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

    public SaleId saleId() {
        return saleId;
    }
}
