package com.guilhermesantos.projecthexagonal.adapters.in.controller;

import com.guilhermesantos.projecthexagonal.adapters.in.controller.mapper.CustomerMapper;
import com.guilhermesantos.projecthexagonal.adapters.in.controller.request.CustomerRequest;
import com.guilhermesantos.projecthexagonal.application.ports.in.InsertCustomerInputPort;

@RestController
@RequestMapping("/api/vi/customers")
public class CustomerController {


    @Autowired
    private InsertCustomerInputPort insertCustomerInputPort;

    @Autowired
    private CustomerMapper customerMapper;

    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody CustomerRequest customerRequest) {
        var customer = customerMapper.toCustomer(customerRequest);
        insertCustomerInputPort.insert(customer, customerRequest.getZipCode());
        return ResponseEntity.ok().build();
    }
}
