package com.sofka.challenge.sale.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofka.challenge.sale.Sale;
import com.sofka.challenge.sale.commands.CreateSale;

public class CreateSaleUseCase extends UseCase<RequestCommand<CreateSale>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<CreateSale> createSaleRequestCommand) {
        var command = createSaleRequestCommand.getCommand();   //trae comando y obtiene su info

        var sale = new Sale(command.saleId(), command.name());  //crea el agregado y le pasa toda la informacion del agregado.

        emit().onResponse(new ResponseEvents(sale.getUncommittedChanges()));  //emite el resultado
    }
}

