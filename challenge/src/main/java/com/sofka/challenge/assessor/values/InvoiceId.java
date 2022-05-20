package com.sofka.challenge.assessor.values;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.generic.Identity;

public class InvoiceId extends Identity {

    public InvoiceId() {
    }

    private InvoiceId(String uuid) {
        super(uuid);
    }

    public InvoiceId of(String Id){
        return new InvoiceId(Id);
    }


}
