package com.guilhermesantos.projecthexagonal.adapters.out.repository.mapper;

import com.guilhermesantos.projecthexagonal.adapters.out.repository.entity.CustomerEntity;
import com.guilhermesantos.projecthexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);

    Customer toCustomer(CustomerEntity customerEntity);
}
