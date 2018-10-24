package comeng.sa.no12.demo.controller;

import comeng.sa.no12.demo.DatabaseLoader;
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

    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private OrdersRepository ordersRespository;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private StaffRepository staffRepository;
    @Autowired
    private CustomerAddressRepository customerAddressRepository;
    private DeliveryRepository deliveryRepository;

    public DeliveryController(DeliveryRepository deliveryRepository) {
        this.deliveryRepository = deliveryRepository;
    }

    @GetMapping(path = "/delivery", produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<Delivery> Delivery() {
        return deliveryRepository.findAll().stream().collect(Collectors.toList());
    }


    @GetMapping("/delivery/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public Delivery deliveryfind(@PathVariable("id") Long id) {
        return deliveryRepository.findByDeliveryId(id);
    }

    

 /* 
   @PostMapping("/delivery/{deliveryId}/{staffName}/{deliveryDate}/{productId}/{productName}/{customerName}/{customerAddress}/{customerId}/{trackId}")
    public Delivery newDelivery(@RequestBody Delivery newDelivery, @PathVariable Long deliveryId,
            @PathVariable Date deliveryDate, @PathVariable Long orderID, @PathVariable String productName,
            @PathVariable String customerName, @PathVariable String customerAddress, @PathVariable Long customerId,
            @PathVariable Long productId, @PathVariable String staffName, @PathVariable String trackId) {

        Customer customer = customerRepository.findByCustomerId(customerId);
        Orders orders = ordersRespository.findByOrderId(orderID);
        CustomerAddress customerAddresss = customerAddressRepository.findByCustomerAddress(customerAddress);
        Product product = productRepository.findByProductId(productId);
        Staff staff = staffRepository.findBystaffName(staffName);

        newDelivery.setDeliveryId(deliveryId);
        newDelivery.setTrackId(trackId);
        newDelivery.setStaffName(staffName);
        newDelivery.setCustomerAddress(customerAddress);
        newDelivery.setCustomerId(customerId);
        newDelivery.setProductId(productId);
        // newDelivery.setOrders(orders);
        newDelivery.setDeliveryDate(deliveryDate);
        newDelivery.setDeliveryDate(new Date());
        return deliveryRepository.save(newDelivery);

    }
    */

}
