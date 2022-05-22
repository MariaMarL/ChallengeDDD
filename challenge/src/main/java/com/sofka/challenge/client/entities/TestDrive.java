package com.sofka.challenge.client.entities;

import co.com.sofka.domain.generic.Entity;
import com.sofka.challenge.client.values.StatusTest;
import com.sofka.challenge.client.values.TestId;
import com.sofka.challenge.share.values.Date;

import java.util.Objects;

public class TestDrive extends Entity<TestId> {
    private Date date;
    private StatusTest statusTest;



    public TestDrive(TestId entityId, Date date, StatusTest statusTest) {
        super(entityId);
        this.date = date;
        this.statusTest = statusTest;

    }

    public void programTestDrive(Date date, StatusTest statusTest){
        this.date = Objects.requireNonNull(date);
        this.statusTest = new StatusTest(StatusTest.Status.PROGRAMMED);
    }

    public void cancelTestDrive(StatusTest statusTest){
        this.statusTest = new StatusTest(StatusTest.Status.CANCELED);
    }


    public Date date() {
        return date;
    }

    public StatusTest statusTest() {
        return statusTest;
    }
}
