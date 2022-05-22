package com.sofka.challenge.sale.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.challenge.sale.values.Name;
import com.sofka.challenge.sale.values.SaleId;

public class SaleCreated extends DomainEvent {

    private final Name name;
    private final SaleId saleId;


    public SaleCreated( SaleId saleId, Name name) {
        super("sofka.sale.assessorcreated");
        this.name = name;
        this.saleId = saleId;
    }


    public SaleId saleId() {
        return saleId;
    }

    public Name name() {
        return name;
    }


}
