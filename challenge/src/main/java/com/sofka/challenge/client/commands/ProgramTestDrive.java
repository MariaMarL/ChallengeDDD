package com.sofka.challenge.client.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.challenge.client.values.ClientId;
import com.sofka.challenge.client.values.StatusTest;
import com.sofka.challenge.client.values.TestId;
import com.sofka.challenge.share.values.Date;

public class ProgramTestDrive extends Command {
    private final Date date;
    private final StatusTest statusTest;
    private final TestId testId;
    private final ClientId clientId;


    public ProgramTestDrive(Date date, StatusTest statusTest, TestId testId, ClientId clientId) {
        this.date = date;
        this.statusTest = statusTest;
        this.testId = testId;
        this.clientId = clientId;
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

    public ClientId client() {
        return clientId;
    }
}
