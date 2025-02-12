package com.guilhermesantos.projecthexagonal.adapters.in.consumer;

import com.guilhermesantos.projecthexagonal.adapters.in.consumer.mapper.CustomerMessageMapper;
import com.guilhermesantos.projecthexagonal.adapters.in.consumer.message.CustomerMessage;
import com.guilhermesantos.projecthexagonal.application.ports.in.UpdateCustomerInPutPorts;

@Component
public class ReceiveValidatedCpfConsumer {

    @Autowired
    private UpdateCustomerInPutPorts updateCustomerInPutPorts;

    @Autowired
    private CustomerMessageMapper customerMessageMapper;

    @KafkaListener(topics = "tp-cpf-validated", grupoId = "guilherme")
    public void receive(CustomerMessage customerMessage){
        var customer = customerMessageMapper.toCustomer(customerMessage);
        updateCustomerInPutPorts.update(customer, customerMessage.getZipCode());
    }
}
