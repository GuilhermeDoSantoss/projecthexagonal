package com.guilhermesantos.projecthexagonal.adapters.in.consumer.message;


@Data
@NoArgsConstruct
@AllArgsConstructor
public class CustomerMessage {

    private String id;
    private String name;
    private String zapCode;
    private String cpf;
    private Boolean isValidCpf;
}
