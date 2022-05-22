package com.sofka.challenge.sale.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.challenge.sale.values.InvoiceId;
import com.sofka.challenge.sale.values.Value;
import com.sofka.challenge.client.values.RegisterId;
import com.sofka.challenge.share.values.Date;

public class InvoiceCreated extends DomainEvent {

    private final Date date;
    private final Value value;
    private final InvoiceId invoiceId;



    public InvoiceCreated(Date date, Value value, InvoiceId invoiceId) {
        super("sofka.sale.invoicecreated");
        this.date = date;
        this.value = value;
        this.invoiceId = invoiceId;
    }

    public Date date() {
        return date;
    }

    public Value value() {
        return value;
    }

    public InvoiceId invoiceId() {
        return invoiceId;
    }

}
