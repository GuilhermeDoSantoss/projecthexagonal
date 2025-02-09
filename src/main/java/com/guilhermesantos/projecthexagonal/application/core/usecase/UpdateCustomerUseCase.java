package com.guilhermesantos.projecthexagonal.application.core.usecase;

import com.guilhermesantos.projecthexagonal.application.core.domain.Customer;
import com.guilhermesantos.projecthexagonal.application.ports.in.FindCustomerByIdInputPort;
import com.guilhermesantos.projecthexagonal.application.ports.in.UpdateCustomerInPutPorts;
import com.guilhermesantos.projecthexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import com.guilhermesantos.projecthexagonal.application.ports.out.UpdateCustomerOutPutPort;

public class UpdateCustomerUseCase implements UpdateCustomerInPutPorts{

    private final FindCustomerByIdInputPort findCustomerByIdInputPort;

    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;

    private final UpdateCustomerOutPutPort updateCustomerOutPutPort;

    public UpdateCustomerUseCase(FindCustomerByIdInputPort findCustomerByIdInputPort,
                                 FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort,
                                 UpdateCustomerOutPutPort updateCustomerOutPutPort) {

        this.findCustomerByIdInputPort = findCustomerByIdInputPort;
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.updateCustomerOutPutPort = updateCustomerOutPutPort;
    }

    @Override
    private void update(Customer customer, String zipCode){
        findCustomerByIdInputPort.find(customer.getId());
        var address = findAddressByZipCodeOutputPort.find(zipCode);
        customer.setAddress(address);
    }
}
