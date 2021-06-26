package org.mateuszziebura.spring5webrest.services;

import org.mateuszziebura.spring5webrest.domain.Customer;

import java.util.List;

public interface CustomerService {
    Customer findCustomerById(Long id);

    List<Customer> findAllCustomers();

    Customer saveCustomer(Customer customer);
}
