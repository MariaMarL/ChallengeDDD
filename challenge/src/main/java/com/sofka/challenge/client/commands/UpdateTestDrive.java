package com.sofka.challenge.client.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.challenge.client.values.StatusTest;
import com.sofka.challenge.client.values.TestId;
import com.sofka.challenge.share.values.Date;

public class UpdateTestDrive extends Command {
    private final Date date;
    private final StatusTest statusTest;
    private final TestId testId;


    public UpdateTestDrive(Date date, StatusTest statusTest, TestId testId) {
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
