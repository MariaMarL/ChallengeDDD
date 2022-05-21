package com.sofka.challenge.sale;

import co.com.sofka.domain.generic.EventChange;
import com.sofka.challenge.sale.entities.Estimate;
import com.sofka.challenge.sale.entities.Invoice;
import com.sofka.challenge.sale.events.*;

public class AssessorChanger extends EventChange {

    public AssessorChanger (Assessor assessor){
        apply((SaleCreated event)->{
           assessor.name = event.name();
        });

        //create
        apply((EstimateCreated event) ->{
           assessor.estimate.add(new Estimate(event.estimateId(),
                                            event.date(),
                                            event.value());
        });
//        Estimate estimate = new Estimate(event.estimateId(),
//               event.date(),
//                event.value());
//         });

        //update
        apply((EstimateUpdated event) ->{
            assessor.estimate().updateEstimate(event.date(),
                                                event.value(),
                                                event.estimateId());
        });

        //create
        apply((InvoiceCreated event)->{
            Invoice invoice = new Invoice(event.invoiceId(),
                                        event.date(),
                                        event.value(),
                                        event.registerId());
        });

        //update
        apply((InvoiceUpdated event)->{
            assessor.invoice().updateInvoice(event.date(),
                                            event.value(),
                                            event.registerId());
        });

        //create
        apply((TrackingProgramed event)->{

        });

    }
}
