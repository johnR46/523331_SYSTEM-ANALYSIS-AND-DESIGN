package comeng.sa.no12.demo.controller;

import comeng.sa.no12.demo.entity.Customer;
import comeng.sa.no12.demo.repository.CustomerRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
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


    @GetMapping("/Customer/{customerId}")
    @CrossOrigin(origins = "http://localhost:4200")
    public Customer customerFind(@PathVariable("customerId") Long id) {
        return customerRepository.findByCustomerId(id);
    }

  
    @GetMapping("/Customer/customeruserID/{customeruserID}")
    @CrossOrigin(origins = "http://localhost:4200")
    public Customer customeruser(@PathVariable("customeruserID") String name) {
        return customerRepository.findBycustomeruserID(name);
    }
    
    @GetMapping("/Customer/customerPassword/{customerPassword}")
    @CrossOrigin(origins = "http://localhost:4200")
    public Customer customerpassword(@PathVariable("customerPassword") String password) {
        return customerRepository.findBycustomerPassword(password);
    }

    @PostMapping("/Customer/customeruserID/{customeruserID}/customerPassword/{customerPassword}")
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<Map<String, Object>> customercheck(@PathVariable("customeruserID") String customeruserID,
            @PathVariable("customerPassword") String customerPassword) {
                Customer customer = this.customerRepository.findBycustomeruserID(customeruserID);
                Customer customer2 = this.customerRepository.findBycustomerPassword(customerPassword);

        if ((customer != null) && (customer2 != null)) {
            Map<String, Object> json = new HashMap<String, Object>();
            json.put("success", true);
            json.put("status", "found");
            json.put("customer", customer);
            HttpHeaders headers = new HttpHeaders();
            headers.add("Content-Type", "application/json; charset=UTF-8");
            headers.add("X-Fsl-Location", "/");
            headers.add("X-Fsl-Response-Code", "302");
            return (new ResponseEntity<Map<String, Object>>(json, headers, HttpStatus.OK));
        } else {
            Map<String, Object> json = new HashMap<String, Object>();
            json.put("success", false);
            json.put("status", "not found");

            HttpHeaders headers = new HttpHeaders();
            headers.add("Content-Type", "application/json; charset=UTF-8");
            headers.add("X-Fsl-Location", "/");
            headers.add("X-Fsl-Response-Code", "404");
            return (new ResponseEntity<Map<String, Object>>(json, headers, HttpStatus.OK));
        }

    }
    




}
