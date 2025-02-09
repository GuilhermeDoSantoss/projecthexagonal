package com.guilhermesantos.projecthexagonal.adapters.in.controller;

import com.guilhermesantos.projecthexagonal.adapters.in.controller.mapper.CustomerMapper;
import com.guilhermesantos.projecthexagonal.adapters.in.controller.request.CustomerRequest;
import com.guilhermesantos.projecthexagonal.adapters.in.controller.response.CustomerResponse;
import com.guilhermesantos.projecthexagonal.application.core.domain.Customer;
import com.guilhermesantos.projecthexagonal.application.ports.in.FindCustomerByIdInputPort;
import com.guilhermesantos.projecthexagonal.application.ports.in.InsertCustomerInputPort;
import com.guilhermesantos.projecthexagonal.application.ports.in.UpdateCustomerInPutPorts;

@RestController
@RequestMapping("/api/vi/customers")
public class CustomerController {


    @Autowired
    private InsertCustomerInputPort insertCustomerInputPort;

    @Autowired
    private FindCustomerByIdInputPort findCustomerByIdInputPort;

    @Autowired
    private UpdateCustomerInPutPorts updateCustomerInPutPorts;

    @Autowired
    private CustomerMapper customerMapper;

    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody CustomerRequest customerRequest) {
        var customer = customerMapper.toCustomer(customerRequest);
        insertCustomerInputPort.insert(customer, customerRequest.getZipCode());
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerResponse> findById(@PathVariable final String id){
        var customer = findCustomerByIdInputPort.find(id);
        var customerResponse = customerMapper.toCustomerResponse(customer);
        return ResponseEntity.ok().body(customerResponse);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable final String id,
                                       @Valid @RequestBody CustomerRequest customerRequest);
    Customer customer = customerMapper.toCustomer(customerRequest);
    customer.setId(id);
    updateCustomerInputPorts.updarte(customer, customerResponse.getZipCode());
    return ResponseEntity.noContent().build();
}
