package comeng.sa.no12.demo;

import comeng.sa.no12.demo.entity.*;
import comeng.sa.no12.demo.repository.*;
import comeng.sa.no12.demo.controller.*;
import java.util.*;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.ApplicationArguments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class DatabaseLoader implements ApplicationRunner{

    private final StaffRepository staffRepository;
    private final CustomerRepository customerRepository;
    private final DeliveryRepository deliveryRepository;
    private final CustomerAddressRepository customerAddressRepository;
    private final OrdersRepository ordersRepository;
    private final ProductRepository productRepository;

    @Autowired
    public DatabaseLoader(StaffRepository staffRepository,
    CustomerRepository customerRepository,
    DeliveryRepository deliveryRepository,
    CustomerAddressRepository customerAddressRepository,
    OrdersRepository ordersRepository,
    ProductRepository productRepository) {
        this.staffRepository = staffRepository;
        this.customerRepository = customerRepository;
        this.customerAddressRepository = customerAddressRepository;
        this.deliveryRepository = deliveryRepository;
        this.productRepository = productRepository;
        this.ordersRepository = ordersRepository;
    }

    @Override 
    public void run(ApplicationArguments args) throws Exception {
        
        // Customer
        Customer c1 = new Customer("PeckEIEI","+66945480484","Peck@1234@gmail.com",8120);
        Customer c2 = new Customer("PuiEIEI","+66986168621","Pui@1234@gmail.com",8121);
        this.customerRepository.save(c1);
        this.customerRepository.save(c2);

        // CustomerAddress
        CustomerAddress ca1 = new CustomerAddress(8120L,"8/120 Ban na soi","8/123 Ban klang soi","Sattahip","Chonburi","Thailand",20180);
        CustomerAddress ca2 = new CustomerAddress(8121L,"8/124 Ban lang soi","8/125 Ban thy soi","Sattahip","Chonburi","Thailand",20180);
        this.customerAddressRepository.save(ca1);
        this.customerAddressRepository.save(ca2);

        // Staff
        Staff s1 = new Staff(55L,"Jason","+66191991119","13/13 Ban na soi");
        Staff s2 = new Staff(56L,"Dexter","+66991199191","13/13 Ban na soi");
        this.staffRepository.save(s1);
        this.staffRepository.save(s2);


        // Delivery
        Delivery d1 = new Delivery();
        d1.setDeliveryDate(new Date(2020-11-15));
        d1.setDeliveryId(1234L);
        d1.setTrackId("KK191911");

        Delivery d2 = new Delivery();
        d2.setDeliveryDate(new Date(2018-10-16));
        d2.setDeliveryId(1235L);
        d2.setTrackId("KK911191");
   
        this.deliveryRepository.save(d1);
        this.deliveryRepository.save(d2);

        // Product
        Product p1 = new Product(8898L,"Nuke-Cola",4L,34L);
        Product p2 = new Product(8898L,"Nuke-Quantum-Cola",4L,999L);
        this.productRepository.save(p1);
        this.productRepository.save(p2);

        // Orders
        Orders o1 = new Orders(8918L,"Nuke-Cola");
        o1.setOrderDate(new Date());
        Orders o2 = new Orders(8919L,"Nuke-Quantum-Cola");
        o2.setOrderDate(new Date());
        this.ordersRepository.save(o1);
        this.ordersRepository.save(o2);



    }
}