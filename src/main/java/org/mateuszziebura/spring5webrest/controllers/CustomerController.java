package org.mateuszziebura.spring5webrest.controllers;


import lombok.RequiredArgsConstructor;
import org.mateuszziebura.spring5webrest.domain.Customer;
import org.mateuszziebura.spring5webrest.services.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/customers")
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping
    List<Customer> getCustomers(){
        return customerService.findAllCustomers();
    }

    @GetMapping("/{id}")
    Customer getCustomerById(@PathVariable Long id){
        return customerService.findCustomerById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Customer saveCustomer(@RequestBody Customer customer){
        return customerService.saveCustomer(customer);
    }
}
