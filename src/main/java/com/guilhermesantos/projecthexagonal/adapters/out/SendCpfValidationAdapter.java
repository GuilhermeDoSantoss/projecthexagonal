package com.guilhermesantos.projecthexagonal.adapters.out;

import com.guilhermesantos.projecthexagonal.application.ports.out.SendCpfForValidationOutputPort;

@Component
public class SendCpfValidationAdapter implements SendCpfForValidationOutputPort {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Override
    public void send(String cpf){
        kafkaTemplate.send("tp-cpf-validation", cpf);
    }
}
