package comeng.sa.no12.demo.controller;

import comeng.sa.no12.demo.entity.Customer;
import comeng.sa.no12.demo.repository.CustomerRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Collection;
import java.util.stream.Collectors;

@CrossOrigin(origins = "http://localhost:4200")
@RestController

class CustomerController {

    @Autowired
    private final CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping("/Customer-list")
    public Collection<Customer> Customer() {
        return customerRepository.findAll().stream().collect(Collectors.toList());
    }

    @GetMapping("/Customer/customerId/{customerId}")
    public Customer Customer(@PathVariable Long customerId) {
        Customer customer = customerRepository.findByCustomerId(customerId);
        return customer;
    }
}
