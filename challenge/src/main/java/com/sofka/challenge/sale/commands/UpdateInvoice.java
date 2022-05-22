package com.sofka.challenge.sale.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.challenge.sale.values.SaleId;
import com.sofka.challenge.sale.values.InvoiceId;
import com.sofka.challenge.sale.values.Value;
import com.sofka.challenge.client.values.RegisterId;
import com.sofka.challenge.share.values.Date;

public class UpdateInvoice extends Command {


    private final Date date;
    private final Value value;
    private final SaleId saleId;


    public UpdateInvoice(Date date, Value value, SaleId saleId) {
        this.date = date;
        this.value = value;
        this.saleId = saleId;
    }

    public Date date() {
        return date;
    }

    public Value value() {
        return value;
    }


    public SaleId saleId() {
        return saleId;
    }
}
