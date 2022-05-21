package com.sofka.challenge.client.values;

import co.com.sofka.domain.generic.Identity;

public class ClientId extends Identity {

    //crear una entidades cuando va a crear el evento
    public ClientId() {
    }

    private ClientId(String uuid) {
        super(uuid);
    }

    public static ClientId of(String Id){
        return new ClientId(Id);
    }



}
