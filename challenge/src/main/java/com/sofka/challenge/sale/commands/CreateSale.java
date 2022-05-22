package com.sofka.challenge.sale.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.challenge.sale.values.SaleId;
import com.sofka.challenge.sale.values.Name;

public class CreateSale extends Command {
    private final Name name;
    private final SaleId saleId;


    public CreateSale(Name name, SaleId saleId) {
        this.name = name;
        this.saleId = saleId;
    }

    public Name name() {
        return name;
    }

    public SaleId saleId() {
        return saleId;
    }
}
