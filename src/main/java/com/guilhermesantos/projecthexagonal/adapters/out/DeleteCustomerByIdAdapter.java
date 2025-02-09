package com.guilhermesantos.projecthexagonal.adapters.out;

import com.guilhermesantos.projecthexagonal.adapters.out.repository.CustomerRepository;
import com.guilhermesantos.projecthexagonal.application.ports.out.DeleteCustomerByIdOutPutPort;

@Component
public class DeleteCustomerByIdAdapter implements DeleteCustomerByIdOutPutPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void delete(String id) {
        customerRepository.deleteById(id);
    }
}
