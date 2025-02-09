package com.guilhermesantos.projecthexagonal.adapters.out;

import com.guilhermesantos.projecthexagonal.adapters.out.repository.CustomerRepository;
import com.guilhermesantos.projecthexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import com.guilhermesantos.projecthexagonal.application.core.domain.Customer;
import com.guilhermesantos.projecthexagonal.application.ports.out.FindCustomerByIdOutPutPort;

import java.util.Optional;

@Component
public class FindCustomerByIdAdapter implements FindCustomerByIdOutPutPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;
    
    @Override
    public Optional<Customer> find(String id) {
        var customerEntity = customerRepository.findById(id);
        return customerEntity.map(entity -> customerEntityMapper.toCustomer(entity));
    }

}
