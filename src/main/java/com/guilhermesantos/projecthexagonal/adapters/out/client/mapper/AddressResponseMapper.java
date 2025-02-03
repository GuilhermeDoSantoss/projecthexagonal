package com.guilhermesantos.projecthexagonal.adapters.out.client.mapper;

import com.guilhermesantos.projecthexagonal.adapters.out.client.response.AddressResponse;
import com.guilhermesantos.projecthexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);
}
