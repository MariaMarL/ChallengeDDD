package com.sofka.challenge.client.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.challenge.client.values.StatusTest;
import com.sofka.challenge.client.values.TestId;

public class TestDriveCanceled extends DomainEvent {


    private final StatusTest statusTest;


    public TestDriveCanceled(StatusTest statusTest) {
        super("sofka.client.testdrivecanceled");
        this.statusTest = statusTest;

    }



    public StatusTest statusTest() {
        return statusTest;
    }
}
