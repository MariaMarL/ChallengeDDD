package com.sofka.challenge.sale.values;

import co.com.sofka.domain.generic.Identity;

public class EstimateId extends Identity {

    public EstimateId() {
    }

    private EstimateId(String uuid) {
        super(uuid);
    }

    public static EstimateId of(String Id){
        return new EstimateId(Id);
    }


}
