package com.sofka.challenge.client.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.challenge.client.values.Budget;

public class CreateClient extends Command {

    private final Budget budget;


    public CreateClient(Budget budget) {
        this.budget = budget;
    }

    public Budget budget() {
        return budget;
    }
}
