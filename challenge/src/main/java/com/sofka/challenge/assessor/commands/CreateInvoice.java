package com.sofka.challenge.assessor.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.challenge.assessor.values.InvoiceId;
import com.sofka.challenge.assessor.values.Value;
import com.sofka.challenge.client.values.RegisterId;
import com.sofka.challenge.share.values.Date;

public class CreateInvoice extends Command {
    private final Date date;
    private final Value value;
    private final InvoiceId invoiceId;
    private final RegisterId registerId;


    public CreateInvoice(Date date, Value value, InvoiceId invoiceId, RegisterId registerId) {
        this.date = date;
        this.value = value;
        this.invoiceId = invoiceId;
        this.registerId = registerId;
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

    public RegisterId registerId() {
        return registerId;
    }
}
