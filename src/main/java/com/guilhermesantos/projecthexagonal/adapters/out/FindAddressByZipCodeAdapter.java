package com.guilhermesantos.projecthexagonal.adapters.out;

import com.guilhermesantos.projecthexagonal.adapters.out.client.FindAddressByZipCodeClient;
import com.guilhermesantos.projecthexagonal.adapters.out.client.mapper.AddressResponseMapper;
import com.guilhermesantos.projecthexagonal.application.core.domain.Address;
import com.guilhermesantos.projecthexagonal.application.ports.out.FindAddressByZipCodeOutputPort;

@Component
public class FindAddressByZipCodeAdapter implements FindAddressByZipCodeOutputPort {

    @Autowired
    private FindAddressByZipCodeClient findAddressByZipCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;


    @Override
    public Address find(String zipCode) {
        var addressResponse = findAddressByZipCodeClient.find(zipCode);
        return addressResponseMapper.toAddress(addressResponse);
    }
}
