package comeng.sa.no12.demo.controller;

import comeng.sa.no12.demo.entity.CustomerAddress;
import comeng.sa.no12.demo.repository.CustomerAddressRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;
import java.util.stream.Collectors;

@RestController
class CustomerAddressController {

    @Autowired
    private final CustomerAddressRepository customerAddressRepository;

    public CustomerAddressController(CustomerAddressRepository customerAddressRepository) {
        this.customerAddressRepository = customerAddressRepository;
    }

    @GetMapping("/CustomerAddress-list")
    public Collection<CustomerAddress> customerAddresses() {
        return customerAddressRepository.findAll().stream().collect(Collectors.toList());
    }

}
