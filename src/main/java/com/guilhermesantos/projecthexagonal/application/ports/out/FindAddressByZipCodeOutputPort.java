package com.guilhermesantos.projecthexagonal.application.ports.out;

import com.guilhermesantos.projecthexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipCode);
}
