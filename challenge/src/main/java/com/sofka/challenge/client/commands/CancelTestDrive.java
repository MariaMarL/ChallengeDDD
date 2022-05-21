package com.sofka.challenge.client.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.challenge.client.values.ClientId;
import com.sofka.challenge.client.values.StatusTest;
import com.sofka.challenge.client.values.TestId;

public class CancelTestDrive extends Command {

    private final TestId testId;
    private final StatusTest statusTest;
    private final ClientId client;


    public CancelTestDrive(TestId testId, StatusTest statusTest, ClientId client) {
        this.testId = testId;
        this.statusTest = statusTest;
        this.client = client;
    }

    public TestId testId() {
        return testId;
    }

    public ClientId client() {
        return client;
    }
}
