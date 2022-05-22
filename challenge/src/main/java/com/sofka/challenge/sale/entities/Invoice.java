package com.sofka.challenge.sale.entities;

import co.com.sofka.domain.generic.Entity;
import com.sofka.challenge.sale.values.InvoiceId;
import com.sofka.challenge.sale.values.Value;
import com.sofka.challenge.share.values.Date;

import java.util.Objects;

public class Invoice  extends Entity<InvoiceId> {
    private Date date;
    private Value value;


    public Invoice(InvoiceId entityId,Date date, Value value) {
        super(entityId);
        this.date = date;
        this.value = value;
    }

    public void createInvoice(Date date, Value value) {
        this.date = Objects.requireNonNull(date);
        this.value = Objects.requireNonNull(value);
    }

    public void updateInvoice(Date date, Value value) {
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
