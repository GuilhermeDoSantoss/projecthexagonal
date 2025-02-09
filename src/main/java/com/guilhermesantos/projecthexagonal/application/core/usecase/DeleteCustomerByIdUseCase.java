package com.guilhermesantos.projecthexagonal.application.core.usecase;

import com.guilhermesantos.projecthexagonal.application.ports.in.DeleteCustomerByIdInputPort;
import com.guilhermesantos.projecthexagonal.application.ports.in.FindCustomerByIdInputPort;
import com.guilhermesantos.projecthexagonal.application.ports.out.DeleteCustomerByIdOutPutPort;

public class DeleteCustomerByIdUseCase implements DeleteCustomerByIdInputPort {

    private final FindCustomerByIdInputPort findCustomerByIdInputPort;

    private final DeleteCustomerByIdOutPutPort deleteCustomerByIdOutPutPort;

    public DeleteCustomerByIdUseCase(FindCustomerByIdInputPort findCustomerByIdInputPort,
                                     DeleteCustomerByIdOutPutPort deleteCustomerByIdOutPutPort){

        this.findCustomerByIdInputPort = findCustomerByIdInputPort;
        this.deleteCustomerByIdOutPutPort = deleteCustomerByIdOutPutPort;
    }

    @Override
    public void delete(String id){
        findCustomerByIdInputPort.find(id);
        deleteCustomerByIdOutPutPort.delete(id);
    }
}
