package com.guilhermesantos.projecthexagonal.application.ports.in;

import com.guilhermesantos.projecthexagonal.application.core.domain.Customer;

public interface UpdateCustomerInPutPorts {

    void update (Customer customer, String zipCode);
}
