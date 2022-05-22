package com.sofka.challenge.sale.values;

import co.com.sofka.domain.generic.ValueObject;
import com.sofka.challenge.client.values.EnumOption;

import java.util.Objects;

public class StatusTracking implements ValueObject<StatusTracking.Option> {

    //public final EnumOption value;
    public final StatusTracking.Option value;


    public StatusTracking(Option value) {
        this.value = value;
        //this.value = Objects.requireNonNull(value);
    }

    @Override
    public Option value() {
        return this.value;
    }


    public enum Option{
        PROGRAMMED, CANCEL, DONE
    }
  //  @Override
  //  public EnumOption value() {
  //      return this.value;
  //  }
}
