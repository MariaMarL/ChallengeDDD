package com.sofka.challenge.sale.values;

import co.com.sofka.domain.generic.Identity;

public class InvoiceId extends Identity {

    public InvoiceId() {
    }

    private InvoiceId(String uuid) {
        super(uuid);
    }

    public static InvoiceId of(String Id){
        return new InvoiceId(Id);
    }


}
