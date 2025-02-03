package com.guilhermesantos.projecthexagonal.adapters.out.client;

import com.guilhermesantos.projecthexagonal.adapters.out.client.response.AddressResponse;

@FeignClient(
        name = "FindAddressByZipCodeClient",
        url = "${guilherme.client.address.url}"
)
public interface FindAddressByZipCodeClient {

    @GetMapping
    AddressResponse find(@PathVariable("zipCode") String zipCode);
}
