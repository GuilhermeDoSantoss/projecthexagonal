package com.guilhermesantos.projecthexagonal.application.ports.out;

public interface SendCpfForValidationOutputPort {

    void send(String cpf);
}
