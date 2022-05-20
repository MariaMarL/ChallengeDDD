package com.sofka.challenge.client.values;

import co.com.sofka.domain.generic.Identity;

public class TestId extends Identity {

    public TestId() {
    }

    private TestId(String uuid) {
        super(uuid);
    }

    public static TestId of(String Id){
        return new TestId(Id);
    }
}
