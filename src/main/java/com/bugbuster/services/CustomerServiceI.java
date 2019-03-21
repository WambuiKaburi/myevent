package com.bugbuster.services;

import com.bugbuster.models.customer.Customer;

import java.util.List;

public interface CustomerServiceI {
    void addCustomer(Customer customer);
    Customer updateCustomer(Customer customer, Long id);
    Customer findById(Long id);
    List<Customer> findAll();
    void deleteCustomer(Long id);
}
