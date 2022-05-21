package com.sofka.challenge.sale.values;

import co.com.sofka.domain.generic.Identity;

public class AssessorId extends Identity {


    public AssessorId() {
    }


    private AssessorId(String uuid) {
        super(uuid);
    }

    public static AssessorId of(String Id){
        return new AssessorId(Id);
    }
}
