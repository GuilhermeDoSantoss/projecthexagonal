package com.guilhermesantos.projecthexagonal.config;

import com.guilhermesantos.projecthexagonal.adapters.out.DeleteCustomerByIdAdapter;
import com.guilhermesantos.projecthexagonal.application.core.usecase.DeleteCustomerByIdUseCase;
import com.guilhermesantos.projecthexagonal.application.core.usecase.FindCustomerByIdUseCase;

@Configuration
public class DeleteCustomerByIdConfig {

    @Bean
    public DeleteCustomerByIdUseCase deleteCustomerByIdUseCase (
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            DeleteCustomerByIdAdapter deleteCustomerByIdAdapter
    ){
        return new DeleteCustomerByIdUseCase(findCustomerByIdUseCase, deleteCustomerByIdAdapter);
    }
}
