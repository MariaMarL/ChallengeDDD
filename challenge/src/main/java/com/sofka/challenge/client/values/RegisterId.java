package com.sofka.challenge.client.values;

import co.com.sofka.domain.generic.Identity;

public class RegisterId extends Identity {

    public RegisterId() {
    }

    private RegisterId(String uuid) {
        super(uuid);
    }

    public static RegisterId of(String Id){
        return new RegisterId(Id);
    }


}
