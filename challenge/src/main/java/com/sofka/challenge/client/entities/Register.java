package com.sofka.challenge.client.entities;

import co.com.sofka.domain.generic.Entity;
import com.sofka.challenge.client.values.Cc;
import com.sofka.challenge.client.values.Name;
import com.sofka.challenge.client.values.RegisterId;

import java.util.Objects;

public class Register extends Entity<RegisterId> {
    private Name name;
    private Cc cc;


    public Register(RegisterId entityId, Name name, Cc cc) {
        super(entityId);
        this.name = name;
        this.cc = cc;

    }

    public void registerClient(Name name, Cc cc){
        this.name = Objects.requireNonNull(name);
        this.cc = Objects.requireNonNull(cc);
    }

    public void updateNameClient(Name name){
        this.name = Objects.requireNonNull(name);
    }

    public void updateCcClient(Cc cc){
        this.cc = Objects.requireNonNull(cc);
    }

    public Name name() {
        return name;
    }

    public Cc cc() {
        return cc;
    }
}
