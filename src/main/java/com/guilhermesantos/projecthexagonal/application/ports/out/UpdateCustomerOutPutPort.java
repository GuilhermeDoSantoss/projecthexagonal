package com.guilhermesantos.projecthexagonal.application.ports.out;

import com.guilhermesantos.projecthexagonal.application.core.domain.Customer;

public interface UpdateCustomerOutPutPort {

    void update(Customer customer);
}
