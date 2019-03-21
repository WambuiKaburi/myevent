package com.bugbuster.controllers;

import com.bugbuster.models.customer.Customer;
import com.bugbuster.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addCustomer(@RequestBody Customer customer){
        customerService.addCustomer(customer);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Customer updateCustomer(@RequestBody Customer customer, @PathVariable Long id) {
        customer.setId(id);
        return customerService.updateCustomer(customer, id);
    }

    @RequestMapping(value = "{/id}", method = RequestMethod.GET)
    public Customer findById(@PathVariable Long id){
        return customerService.findById(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Customer> findAll(){
        return customerService.findAll();
    }

    @RequestMapping(value = "{/id}", method = RequestMethod.DELETE)
    public void deleteCustomer(@PathVariable Long id){
        customerService.deleteCustomer(id);
    }
}
