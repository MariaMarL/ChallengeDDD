package com.sofka.challenge.sale.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.challenge.sale.values.InvoiceId;
import com.sofka.challenge.sale.values.Value;
import com.sofka.challenge.client.values.RegisterId;
import com.sofka.challenge.share.values.Date;

public class InvoiceUpdated extends DomainEvent {

    private final Date date;
    private final Value value;


    public InvoiceUpdated(Date date, Value value) {
        super("sofka.sale.invoiceupdated");
        this.date = date;
        this.value = value;
    }

    public Date date() {
        return date;
    }

    public Value value() {
        return value;
    }

}
