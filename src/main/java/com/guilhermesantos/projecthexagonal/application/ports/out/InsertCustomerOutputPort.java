package com.guilhermesantos.projecthexagonal.application.ports.out;

import com.guilhermesantos.projecthexagonal.application.core.domain.Customer;
import org.mapstruct.ap.internal.conversion.CurrencyToStringConversion;

public interface InsertCustomerOutputPort {

    void insert(Customer customer);
}
