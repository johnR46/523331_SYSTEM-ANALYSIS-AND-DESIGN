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

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;


@CrossOrigin(origins = "http://localhost:4200")
@RestController

class DeliveryController {

    @Autowired private CustomerRepository customerRepository;
    @Autowired private OrdersRepository ordersRespository;
    @Autowired private ProductRepository productRepository;
    @Autowired private StaffRepository staffRepository;
    @Autowired private CustomerAddressRepository customerAddressRepository;
    private DeliveryRepository deliveryRepository;

    public DeliveryController(DeliveryRepository deliveryRepository) {
        this.deliveryRepository = deliveryRepository;
    }

    @GetMapping(path = "/delivery", produces = MediaType.APPLICATION_JSON_VALUE )
    public Collection<Delivery> Delivery(){
        return deliveryRepository.findAll().stream().collect(Collectors.toList());
    }

    
   @PostMapping("/delivery/{delivery_id}/{dalivery_date}/{product_id}/{product_name}/{customer_name}/{customer_address}/{customer_id}/{track_id}")
public Delivery newDelivery(@RequestBody Delivery newDelivery,
                        @PathVariable Long delivery_id,
                        @PathVariable Date dalivery_date,
                        @PathVariable Long order_id,
                        @PathVariable String product_name,
                        @PathVariable String customer_name,
                        @PathVariable String customer_address,
                        @PathVariable Long customer_id,
                        @PathVariable String track_id){

Customer customer = customerRepository.findByCustomerId(customer_id);
Orders orders = ordersRespository.findByOrderId(order_id);
CustomerAddress customerAddress = customerAddressRepository.findByAddressId(customer_address);

 //newDelivery.setCustomer(customer);
 //newDelivery.setOrders(orders);
 //newDelivery.setCustomerAddress(customerAddress);
 newDelivery.setDeliveryDate(new Date());
 return deliveryRepository.save(newDelivery);


 

 }                 
   
} 
