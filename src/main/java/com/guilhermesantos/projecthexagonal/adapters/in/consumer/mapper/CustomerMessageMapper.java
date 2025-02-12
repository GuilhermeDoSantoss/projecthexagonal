package com.guilhermesantos.projecthexagonal.adapters.in.consumer.mapper;

import com.guilhermesantos.projecthexagonal.adapters.in.consumer.message.CustomerMessage;
import com.guilhermesantos.projecthexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMessageMapper {


    Customer toCustomer(CustomerMessage customerMessage);
}
