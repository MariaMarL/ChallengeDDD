package com.sofka.challenge.sale.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.challenge.sale.values.SaleId;
import com.sofka.challenge.sale.values.StatusTracking;

public class CancelTracking extends Command {

    private final SaleId saleId;

    public CancelTracking( SaleId saleId) {

        this.saleId = saleId;
    }

    public SaleId saleId() {
        return saleId;
    }
}
