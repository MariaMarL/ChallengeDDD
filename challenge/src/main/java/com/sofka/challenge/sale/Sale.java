package com.sofka.challenge.sale;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.challenge.sale.entities.Estimate;
import com.sofka.challenge.sale.entities.Invoice;
import com.sofka.challenge.sale.entities.Tracking;
import com.sofka.challenge.sale.events.*;
import com.sofka.challenge.sale.values.*;
import com.sofka.challenge.share.values.Date;

import java.util.List;

public class Sale extends AggregateEvent<SaleId> {

    protected Estimate estimate;
    protected Invoice invoice;
    protected Tracking tracking;
    protected Name name;

    public Sale(SaleId entityId, Name name) {
        super(entityId);
        appendChange(new SaleCreated(entityId,name)).apply();
    }

    private Sale(SaleId saleId){
        super(saleId);
        subscribe(new SaleChange(this));
    }

    public static Sale from(SaleId saleId, List<DomainEvent> events){
        Sale sale = new Sale(saleId);
        events.forEach((event)-> sale.applyEvent(event));
        return sale;
    }

    public void createEstimate(Date date, Value value){
       EstimateId estimateId = new EstimateId();
       appendChange(new EstimateCreated(estimateId, date, value)).apply();
    }

    public void updateEstimate(Date date, Value value){
        appendChange(new EstimateUpdated(date,value)).apply();
    }

    public void createInvoice(Date date, Value value){
        InvoiceId invoiceId = new InvoiceId();  //creo el id
        appendChange(new InvoiceCreated(date,value, invoiceId)).apply();
    }

    public void updateInvoice(Date date, Value value){
        appendChange(new InvoiceUpdated(date,value)).apply();
    }

    public void programTracking(Date date, StatusTracking statusTracking){
        TrackingId trackingId = new TrackingId();
        appendChange(new TrackingProgramed(date,statusTracking, trackingId)).apply();
    }


    public void cancelTracking(){
        appendChange(new TrackingCanceled()).apply();
    }

    public Estimate estimate() {
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
