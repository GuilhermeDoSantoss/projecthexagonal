package com.guilhermesantos.projecthexagonal.application.ports.in;

import com.guilhermesantos.projecthexagonal.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {

    Customer find(String id);
}
