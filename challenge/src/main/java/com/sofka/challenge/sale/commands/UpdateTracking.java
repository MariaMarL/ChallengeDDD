package com.sofka.challenge.assessor.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.challenge.assessor.values.AssessorId;
import com.sofka.challenge.share.values.Date;

public class UpdateTracking extends Command {
    private final Date date;
    private final AssessorId assessorId;


    public UpdateTracking(Date date, AssessorId assessorId) {
        this.date = date;
        this.assessorId = assessorId;
    }

    public Date date() {
        return date;
    }

    public AssessorId assessorId() {
        return assessorId;
    }
}
