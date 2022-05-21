package com.sofka.challenge.assessor.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.challenge.share.values.Date;

public class UpdateTracking extends Command {
    private final Date date;


    public UpdateTracking(Date date) {
        this.date = date;
    }

    public Date date() {
        return date;
    }
}
