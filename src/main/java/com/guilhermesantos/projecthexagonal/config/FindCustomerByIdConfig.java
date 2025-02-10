package com.guilhermesantos.projecthexagonal.config;

import com.guilhermesantos.projecthexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.guilhermesantos.projecthexagonal.adapters.out.FindCustomerByIdAdapter;
import com.guilhermesantos.projecthexagonal.adapters.out.InsertCustomerAdapter;
import com.guilhermesantos.projecthexagonal.application.core.usecase.FindCustomerByIdUseCase;
import com.guilhermesantos.projecthexagonal.application.core.usecase.InsertCustomerUseCase;

@Configuration
public class FindCustomerByIdConfig {

    @Bean
    public FindCustomerByIdUseCase findCustomerByIdUseCase(
            FindCustomerByIdAdapter findCustomerByIdAdapter)
    {
        return new FindCustomerByIdUseCase(findCustomerByIdAdapter);
    }
}
