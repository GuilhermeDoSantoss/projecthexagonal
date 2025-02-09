package com.guilhermesantos.projecthexagonal.adapters.in.controller.response;

import com.guilhermesantos.projecthexagonal.application.core.domain.Address;

@Data
public class CustomerResponse {

    private String name;
    private AddressResponse address;
    private String cpf;
    private Boolean isValidCpf;
}
