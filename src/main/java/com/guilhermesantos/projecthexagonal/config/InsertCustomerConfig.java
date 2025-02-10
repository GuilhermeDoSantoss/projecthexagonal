package com.guilhermesantos.projecthexagonal.config;

import com.guilhermesantos.projecthexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.guilhermesantos.projecthexagonal.adapters.out.InsertCustomerAdapter;
import com.guilhermesantos.projecthexagonal.application.core.usecase.InsertCustomerUseCase;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            InsertCustomerAdapter insertCustomerAdapter)
    {
        return new InsertCustomerUseCase(findAddressByZipCodeAdapter, insertCustomerAdapter);
    }
}
