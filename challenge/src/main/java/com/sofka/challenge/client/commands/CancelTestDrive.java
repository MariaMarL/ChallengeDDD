package com.sofka.challenge.client.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.challenge.client.values.ClientId;
import com.sofka.challenge.client.values.StatusTest;
import com.sofka.challenge.client.values.TestId;

public class CancelTestDrive extends Command {

    private final TestId testId;
    private final StatusTest statusTest;
    private final ClientId clientId;


    public CancelTestDrive(TestId testId, StatusTest statusTest, ClientId clientId) {
        this.testId = testId;
        this.statusTest = statusTest;
        this.clientId = clientId;
    }

    public TestId testId() {
        return testId;
    }

    public StatusTest statusTest() {
        return statusTest;
    }

    public ClientId clientId() {
        return clientId;
    }
}
