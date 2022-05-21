package com.sofka.challenge.client.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.challenge.client.values.TestId;

public class TestDriveCanceled extends DomainEvent {

    private final TestId testId;


    public TestDriveCanceled(TestId testId) {
        super("sofka.client.testdrivecanceled");
        this.testId = testId;
    }

    public TestId testId() {
        return testId;
    }
}
