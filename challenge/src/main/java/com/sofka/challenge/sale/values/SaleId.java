package com.sofka.challenge.sale.values;

import co.com.sofka.domain.generic.Identity;

public class SaleId extends Identity {


    public SaleId() {
    }


    private SaleId(String uuid) {
        super(uuid);
    }

    public static SaleId of(String Id){
        return new SaleId(Id);
    }
}
