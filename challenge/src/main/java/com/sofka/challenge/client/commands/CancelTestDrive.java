package com.sofka.challenge.client.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.challenge.client.values.StatusTest;
import com.sofka.challenge.client.values.TestId;

public class CancelTestDrive extends Command {

    private final TestId testId;
    private final StatusTest statusTest;


    public CancelTestDrive(TestId testId, StatusTest statusTest) {
        this.testId = testId;
        this.statusTest = statusTest;
    }

    public TestId testId() {
        return testId;
    }
}
