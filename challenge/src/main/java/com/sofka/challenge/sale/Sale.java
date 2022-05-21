package com.sofka.challenge.sale;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.challenge.sale.entities.Estimate;
import com.sofka.challenge.sale.entities.Invoice;
import com.sofka.challenge.sale.entities.Tracking;
import com.sofka.challenge.sale.events.SaleCreated;
import com.sofka.challenge.sale.events.EstimateCreated;
import com.sofka.challenge.sale.events.EstimateUpdated;
import com.sofka.challenge.sale.values.SaleId;
import com.sofka.challenge.sale.values.EstimateId;
import com.sofka.challenge.sale.values.Name;
import com.sofka.challenge.sale.values.Value;
import com.sofka.challenge.share.values.Date;

import java.util.List;
import java.util.Objects;

public class Assessor extends AggregateEvent<SaleId> {

    protected List<Estimate> estimate;
    protected Invoice invoice;
    protected Tracking tracking;
    protected Name name;

    public Assessor(SaleId entityId, Name name) {
        super(entityId);
        appendChange(new SaleCreated(name)).apply();
    }

    private Assessor(SaleId assessorId){
        super(assessorId);
        subscribe(new AssessorChanger(this));
    }

    private static Assessor from(SaleId assessorId, List<DomainEvent> events){
        Assessor assessor = new Assessor(assessorId);
        events.forEach((event)-> assessor.applyEvent(event));
        return assessor;
    }

    public void createEstimate(Date date, Value value, EstimateId estimateId){
        Objects.requireNonNull(date);
        Objects.requireNonNull(value);
        Objects.requireNonNull(estimateId);

        appendChange(new EstimateCreated(date, value, estimateId));

    }

    public void updateEstimate(Date date, Value value, EstimateId estimateId){
        Objects.requireNonNull(date);
        Objects.requireNonNull(value);
        Objects.requireNonNull(estimateId);
        appendChange(new EstimateUpdated(date,value,estimateId));
    }


    public List<Estimate> estimate() {
        return estimate;
    }

    public Invoice invoice() {
        return invoice;
    }

    public Tracking tracking() {
        return tracking;
    }

    public Name name() {
        return name;
    }
}
