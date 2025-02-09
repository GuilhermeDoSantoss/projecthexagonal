package com.guilhermesantos.projecthexagonal.adapters.in.controller.mapper;

import com.guilhermesantos.projecthexagonal.adapters.in.controller.request.CustomerRequest;
import com.guilhermesantos.projecthexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address", ignore = true)
    @Mapping(target = "isValidCpf", ignore = true)
    Customer toCstomer(CustomerRequest customerRequest);
}
