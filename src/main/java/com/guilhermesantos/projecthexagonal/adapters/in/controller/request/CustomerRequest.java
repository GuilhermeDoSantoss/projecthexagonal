package com.guilhermesantos.projecthexagonal.adapters.in.controller.request;


@Data
public class CustomerRequest {

    @NotBlank
    private String name;

    @NotBlank
    private String cpf;

    @NotBlank
    private String zipCode;
}
