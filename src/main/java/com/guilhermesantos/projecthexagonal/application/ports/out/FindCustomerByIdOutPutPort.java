package com.guilhermesantos.projecthexagonal.application.ports.out;

import com.guilhermesantos.projecthexagonal.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutPutPort {

    Optional<Customer> find(String id);
}
