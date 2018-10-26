package comeng.sa.no12.demo.controller;

import comeng.sa.no12.demo.entity.*;
import comeng.sa.no12.demo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.audit.AuditEventRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;
import java.util.Date;
import java.util.stream.Collectors;
import lombok.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;


import org.springframework.web.bind.annotation.PostMapping;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
class DeliveryController {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private OrdersRepository ordersRespository;
    @Autowired
    private StaffRepository staffRepository;
   

    private DeliveryRepository deliveryRepository;

    public DeliveryController(DeliveryRepository deliveryRepository,
     CustomerRepository customerRepository,
     OrdersRepository ordersRespository,
     StaffRepository staffRepository) {
        this.deliveryRepository = deliveryRepository;
        this.customerRepository = customerRepository;
        this.ordersRespository = ordersRespository;
        this.staffRepository = staffRepository;

    }

    // @GetMapping("/Delivery/{id}")
    // public Delivery delivery(@PathVariable("id") Long id) {
    //     return deliveryRepository.findByDeliveryId(id);
    // }

    
    // @GetMapping("/Delivery")
    // public Collection<Delivery> delivery() {
    //     return deliveryRepository.findAll().stream().collect(Collectors.toList());
    // }
   

}
