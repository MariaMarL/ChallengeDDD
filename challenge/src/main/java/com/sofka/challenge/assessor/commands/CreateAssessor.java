package com.sofka.challenge.assessor.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.challenge.assessor.values.Name;

public class CreateAssessor extends Command {
    private final Name name;


    public CreateAssessor(Name name) {
        this.name = name;
    }

    public Name name() {
        return name;
    }
    }
