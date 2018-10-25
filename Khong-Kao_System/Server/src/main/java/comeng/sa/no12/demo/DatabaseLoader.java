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


    @Autowired
    public DatabaseLoader(StaffRepository staffRepository,
    CustomerRepository customerRepository,
    DeliveryRepository deliveryRepository,
    CustomerAddressRepository customerAddressRepository,
    OrdersRepository ordersRepository) {
        this.staffRepository = staffRepository;
        this.customerRepository = customerRepository;
        this.customerAddressRepository = customerAddressRepository;
        this.deliveryRepository = deliveryRepository;
        this.ordersRepository = ordersRepository;
    }

    @Override 
    public void run(ApplicationArguments args) throws Exception {
        
        // Customer
        Customer c1 = new Customer();
        c1.setCustomerName("PeckEIEI");
        c1.setAddressId(555L);
        c1.setCustomerId(12345L);
        c1.setCustomerphone("+66945480484");
        c1.setCustomeremail("Peck@1234@gmail.com");
        this.customerRepository.save(c1);

        Customer c2 = new Customer();
        c2.setCustomerName("PuiEIEI");
        c2.setAddressId(556L);
        c2.setCustomerId(12335L);
        c2.setCustomerphone("+66986168621");
        c2.setCustomeremail("Pui@1234@gmail.com");
        this.customerRepository.save(c2);

        // CustomerAddress
        CustomerAddress ca1 = new CustomerAddress();
         ca1.setAddressId(555L);
         ca1.setCustomerAddress("8/120 Ban na soi");
         ca1.setCustomerAddress2("8/123 Ban klang soi");
         ca1.setDistrict("Sattahip");
         ca1.setCity("Chonburi");
         ca1.setCountry("Thailand");
         ca1.setZipCode(20180);
         this.customerAddressRepository.save(ca1);

        CustomerAddress ca2 = new CustomerAddress();
        ca2.setAddressId(556L);
         ca2.setCustomerAddress("8/124 Ban lang soi");
         ca2.setCustomerAddress2("8/125 Ban thy soi");
         ca2.setDistrict("Sattahip");
         ca2.setCity("Chonburi");
         ca2.setCountry("Thailand");
         ca2.setZipCode(20180);
        this.customerAddressRepository.save(ca2);

        // Staff
        Staff s1 = new Staff();
        s1.setStaffId(987L);
        s1.setStaffName("Jason");
        s1.setStaffPhone("+66191991119");
        s1.setStaffAddress("13/13 Ban na soi");
        s1.setStaffUserID("staff1");
        s1.setStaffPassword("1234");
        this.staffRepository.save(s1);

        Staff s2 = new Staff();
        s2.setStaffId(986L);
        s2.setStaffName("Dexter");
        s2.setStaffPhone("+66991199191");
        s2.setStaffAddress("13/13 Ban na soi");
        s2.setStaffUserID("staff2");
        s2.setStaffPassword("5678");
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

        // Orders
        Orders o1 = new Orders();
        o1.setOrderId(8918L);
        o1.setProductName("Nuke-Cola");
        o1.setOrderDate(new Date());
        this.ordersRepository.save(o1);


        Orders o2 = new Orders(8919L,"Nuke-Quantum-Cola");
        o2.setOrderId(8919L);
        o2.setProductName("Nuke-Quantum-Cola");
        o2.setOrderDate(new Date());
        this.ordersRepository.save(o2);



    }
}