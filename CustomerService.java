package com.klef.jfsd.exam.service;

import com.klef.jfsd.exam.model.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    List<Customer> getAllCustomers();
    Optional<Customer> getCustomerById(Long id);
    Customer saveCustomer(Customer customer);
    Customer updateCustomer(Long id, Customer customer);
}
