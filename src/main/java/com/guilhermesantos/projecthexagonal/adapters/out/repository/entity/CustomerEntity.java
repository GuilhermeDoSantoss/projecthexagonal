package com.guilhermesantos.projecthexagonal.adapters.out.repository.entity;

@Data
@Document(collection = "customers")
public class CustomerEntity {

    @Id
    private String id;
    private String name;
    private AddressEntity address;
    private String cpf;
    private Boolean isValidCpf;
}
