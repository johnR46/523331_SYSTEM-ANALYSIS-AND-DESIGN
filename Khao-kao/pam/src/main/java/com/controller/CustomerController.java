package com.controller;
import com.entity.Customer;
import com.repository.CustomerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
class CustomerController{
    
    private CustomerRepository customerRepository;
 
    public CustomerController(CustomerRepository customerRepository){
            this.customerRepository = customerRepository;

    }

    @GetMapping("/customer-list")
    @CrossOrigin(origins = "http://localhost:4200")
    public Collection<Customer> CustomerList() {
        return customerRepository.findAll().stream()
        .collect(Collectors.toList());

    }

}