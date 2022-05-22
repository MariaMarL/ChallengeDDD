package com.sofka.challenge.sale;

import co.com.sofka.domain.generic.EventChange;
import com.sofka.challenge.sale.entities.Estimate;
import com.sofka.challenge.sale.entities.Invoice;
import com.sofka.challenge.sale.entities.Tracking;
import com.sofka.challenge.sale.events.*;

public class SaleChange extends EventChange {

    public SaleChange(Sale sale){
        apply((SaleCreated event)->{
           sale.name = event.name();
        });

        //create
        apply((EstimateCreated event) ->{
         Estimate estimate = new Estimate(event.estimateId(), event.date(), event.value());
         sale.estimate = estimate;
        });

        //update
        apply((EstimateUpdated event) ->{
            sale.estimate().updateEstimate(event.date(), event.value());
        });

        //create
        apply((InvoiceCreated event)->{
            Invoice invoice = new Invoice(event.invoiceId(), event.date(), event.value());
            sale.invoice = invoice;
        });

        //update
        apply((InvoiceUpdated event)->{
           sale.invoice().updateInvoice(event.date(), event.value());
        });


        //create
        apply((TrackingProgramed event)->{
            Tracking tracking = new Tracking(event.trackingId(), event.date());
            sale.tracking = tracking;
        });


        //update
        apply((TrackingCanceled event)->{
            sale.tracking.CancelTracking();
        });

    }
}
