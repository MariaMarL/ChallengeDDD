package com.sofka.challenge.sale.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.challenge.sale.values.SaleId;
import com.sofka.challenge.sale.values.InvoiceId;
import com.sofka.challenge.sale.values.Value;
import com.sofka.challenge.client.values.RegisterId;
import com.sofka.challenge.share.values.Date;

public class CreateInvoice extends Command {
    private final Date date;
    private final Value value;
    private final InvoiceId invoiceId;
    private final SaleId saleId;


    public CreateInvoice(Date date, Value value, InvoiceId invoiceId, SaleId saleId) {
        this.date = date;
        this.value = value;
        this.invoiceId = invoiceId;
        this.saleId = saleId;
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

    public SaleId saleId() {
        return saleId;
    }
}
