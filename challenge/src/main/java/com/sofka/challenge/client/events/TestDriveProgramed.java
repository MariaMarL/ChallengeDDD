package com.sofka.challenge.client.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.challenge.client.values.StatusTest;
import com.sofka.challenge.client.values.TestId;
import com.sofka.challenge.share.values.Date;

public class TestDriveProgramed extends DomainEvent {

    private final Date date;
    private final StatusTest statusTest;
    private final TestId testId;


    public TestDriveProgramed(Date date, StatusTest statusTest, TestId testId) {
        super("sofka.client.testdriveprogrammed");
        this.date = date;
        this.statusTest = statusTest;
        this.testId = testId;
    }

    public Date date() {
        return date;
    }

    public StatusTest statusTest() {
        return statusTest;
    }

    public TestId testId() {
        return testId;
    }
}
