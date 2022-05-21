package com.sofka.challenge.assessor.entities;

import co.com.sofka.domain.generic.Entity;
import com.sofka.challenge.assessor.values.InvoiceId;
import com.sofka.challenge.assessor.values.Value;
import com.sofka.challenge.client.values.RegisterId;
import com.sofka.challenge.share.values.Date;

import java.util.Objects;

public class Invoice  extends Entity<InvoiceId> {
    private Date date;
    private Value value;
    private RegisterId registerId;


    public Invoice(InvoiceId entityId,Date date, Value value, RegisterId registerId) {
        super(entityId);
        this.date = date;
        this.value = value;
        this.registerId = registerId;
    }

    public void createInvoice(Date date, Value value, RegisterId registerId) {
        this.date = Objects.requireNonNull(date);
        this.value = Objects.requireNonNull(value);
        this.registerId = Objects.requireNonNull(registerId);
    }

    public void updateInvoice(Date date, Value value, RegisterId registerId) {
        this.date = Objects.requireNonNull(date);
        this.value = Objects.requireNonNull(value);
        this.registerId = Objects.requireNonNull(registerId);
    }

    public Date date() {
        return date;
    }

    public Value value() {
        return value;
    }

    public RegisterId registerId() {
        return registerId;
    }
}
