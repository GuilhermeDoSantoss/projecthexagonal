package com.guilhermesantos.projecthexagonal.adapters.out;

import com.guilhermesantos.projecthexagonal.adapters.out.repository.CustomerRepository;
import com.guilhermesantos.projecthexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import com.guilhermesantos.projecthexagonal.application.core.domain.Customer;
import com.guilhermesantos.projecthexagonal.application.ports.out.UpdateCustomerOutPutPort;

@Component
public class UpdateCustomerAdapter implements UpdateCustomerOutPutPort {

   @Autowired
   private CustomerRepository customerRepository;

   @Autowired
   private CustomerEntityMapper customerEntityMapper;

    @Override
    public void update(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);

    }
}
