package com.sofka.challenge.sale.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.challenge.sale.values.AssessorId;
import com.sofka.challenge.sale.values.Name;

public class CreateAssessor extends Command {
    private final Name name;
    private final AssessorId assessorId;


    public CreateAssessor(Name name, AssessorId assessorId) {
        this.name = name;
        this.assessorId = assessorId;
    }

    public Name name() {
        return name;
    }

    public AssessorId assessorId() {
        return assessorId;
    }
}
