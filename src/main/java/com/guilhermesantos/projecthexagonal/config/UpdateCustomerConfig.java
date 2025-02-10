package com.guilhermesantos.projecthexagonal.config;

import com.guilhermesantos.projecthexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.guilhermesantos.projecthexagonal.adapters.out.FindCustomerByIdAdapter;
import com.guilhermesantos.projecthexagonal.adapters.out.UpdateCustomerAdapter;
import com.guilhermesantos.projecthexagonal.application.core.usecase.FindCustomerByIdUseCase;
import com.guilhermesantos.projecthexagonal.application.core.usecase.UpdateCustomerUseCase;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCase updateCustomerUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            UpdateCustomerAdapter updateCustomerAdapter
    ){
        return new UpdateCustomerUseCase(findCustomerByIdUseCase, findAddressByZipCodeAdapter, updateCustomerAdapter);
    }
}
