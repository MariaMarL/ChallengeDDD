package com.sofka.challenge.client.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.challenge.client.values.StatusTest;
import com.sofka.challenge.client.values.TestId;

public class TestDriveCanceled extends DomainEvent {

    private final TestId testId;
    private final StatusTest statusTest;


    public TestDriveCanceled(TestId testId, StatusTest statusTest, StatusTest statusTest1) {
        super("sofka.client.testdrivecanceled");
        this.testId = testId;
        this.statusTest = statusTest;

    }

    public TestId testId() {
        return testId;
    }


    public StatusTest statusTest() {
        return statusTest;
    }
}
