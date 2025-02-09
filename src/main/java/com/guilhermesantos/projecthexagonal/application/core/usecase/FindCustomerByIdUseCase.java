package com.guilhermesantos.projecthexagonal.application.core.usecase;

import com.guilhermesantos.projecthexagonal.application.core.domain.Customer;
import com.guilhermesantos.projecthexagonal.application.ports.in.FindCustomerByIdInputPort;
import com.guilhermesantos.projecthexagonal.application.ports.out.FindCustomerByIdOutPutPort;

public class FindCustomerByIdUseCase implements FindCustomerByIdInputPort {

    private final FindCustomerByIdOutPutPort findCustomerByIdOutPutPort;

    public FindCustomerByIdUseCase(FindCustomerByIdOutPutPort findCustomerByIdOutPutPort) {
        this.findCustomerByIdOutPutPort = findCustomerByIdOutPutPort;
    }

    @Override
    public Customer find(String id){
        return findCustomerByIdOutPutPort.find(id)
                .orElseThrow(() -> new RuntimeException("Customer not found"));
    }
}
