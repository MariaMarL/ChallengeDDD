package com.sofka.challenge.client.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.challenge.client.values.TestId;

public class CancelTestDrive extends Command {

    private final TestId testId;


    public CancelTestDrive(TestId testId) {
        this.testId = testId;
    }

    public TestId testId() {
        return testId;
    }
}
