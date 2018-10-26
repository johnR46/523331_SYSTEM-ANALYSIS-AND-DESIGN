package comeng.sa.no12.demo;

import comeng.sa.no12.demo.entity.*;
import comeng.sa.no12.demo.repository.*;
import comeng.sa.no12.demo.controller.*;

import java.time.LocalDate;
import java.util.*;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.ApplicationArguments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements ApplicationRunner {

    private final StaffRepository staffRepository;
    private final CustomerRepository customerRepository;
    private final DeliveryRepository deliveryRepository;
    private final CustomerAddressRepository customerAddressRepository;
    private final OrdersRepository ordersRepository;

    private final Bill_of_ladingRepository bill_of_ladingRepository;
    private final TypeItemRepository typeItemRepository;
    private final ItemRepository itemRepository;
    private final ListItemRepository listItemRepository;
    private final ProvinceRepository provinceRepository;
    private final GenderRepository genderRepository;
    private final DetailsRepository detailsRepository;
    private final PostedRepository postedRepository;
    private final CategoryRepository categoryRepository;

    @Autowired
    public DatabaseLoader(StaffRepository staffRepository, CustomerRepository customerRepository,
            DeliveryRepository deliveryRepository, CustomerAddressRepository customerAddressRepository,
            OrdersRepository ordersRepository, Bill_of_ladingRepository bill_of_ladingRepository,
            TypeItemRepository typeItemRepository, ItemRepository itemRepository, ListItemRepository listItemRepository,
            ProvinceRepository provinceRepository, GenderRepository genderRepository,
            DetailsRepository detailsRepository, PostedRepository postedRepository,
            CategoryRepository categoryRepository) {
        this.staffRepository = staffRepository;
        this.customerRepository = customerRepository;
        this.customerAddressRepository = customerAddressRepository;
        this.deliveryRepository = deliveryRepository;
        this.ordersRepository = ordersRepository;
        this.bill_of_ladingRepository = bill_of_ladingRepository;
        this.typeItemRepository = typeItemRepository;
        this.itemRepository = itemRepository;

        this.listItemRepository = listItemRepository;
        this.provinceRepository = provinceRepository;
        this.genderRepository = genderRepository;
        this.detailsRepository = detailsRepository;
        this.postedRepository = postedRepository;
        this.categoryRepository = categoryRepository;

    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        this.genderRepository.save(new Gender("MAN"));
        this.genderRepository.save(new Gender("Woman"));
        this.genderRepository.save(new Gender("Lesbian"));
        Gender g1 = this.genderRepository.findByGenderId(1L);
        Gender g2 = this.genderRepository.findByGenderId(2L);
        Gender g3 = this.genderRepository.findByGenderId(3L);


        this.customerAddressRepository.save(new CustomerAddress("Surnaree", "suraswad", "suraswd2", "korth", 30000));
        this.customerAddressRepository
                .save(new CustomerAddress("Surnaree2", "suraswad2", "suraswd3", "korth2", 300000));
        this.customerAddressRepository
                .save(new CustomerAddress("Surnare4", "suraswad3", "suraswd4", "korth3", 3000000));
        CustomerAddress ca1 = this.customerAddressRepository.findByAddressId(1L);
        CustomerAddress ca2 = this.customerAddressRepository.findByAddressId(2L);
        CustomerAddress ca3 = this.customerAddressRepository.findByAddressId(3L);

        this.deliveryRepository.save(new Delivery(new Date(2020 - 11 - 15), "KK191911"));
        this.deliveryRepository.save(new Delivery(new Date(2021 - 11 - 15), "BBewfa2"));
        this.deliveryRepository.save(new Delivery(new Date(2022 - 11 - 15), "AAewfa122"));
        Delivery de1 = this.deliveryRepository.findByDeliveryId(1L);
        Delivery de2 = this.deliveryRepository.findByDeliveryId(2L);
        Delivery de3 = this.deliveryRepository.findByDeliveryId(3L);

        this.detailsRepository.save(new Details("kao", 20, "Khong", "BLACK"));
        this.detailsRepository.save(new Details("koa", 20, "Khong", "RED"));
        this.detailsRepository.save(new Details("oka", 20, "Khong", "YELLO"));
        Details d1 = this.detailsRepository.findByDetailsId(1L);
        Details d2 = this.detailsRepository.findByDetailsId(2L);
        Details d3 = this.detailsRepository.findByDetailsId(3L);

        this.itemRepository.save(new Item("Coke", "CaPeEnd", 15.0, 1));
        this.itemRepository.save(new Item("joke", "CaPeEnd", 15.0, 3));
        this.itemRepository.save(new Item("Water", "CaPeEnd", 15.0, 1));
        Item i1 = this.itemRepository.findByItemId(1L);
        Item i2 = this.itemRepository.findByItemId(2L);
        Item i3 = this.itemRepository.findByItemId(3L);

        // Item i1 = this.itemRepository.findByItemId(1L);

        // no ListItem

        this.ordersRepository.save(new Orders("jxx", new Date(2016 - 15 - 9)));
        this.ordersRepository.save(new Orders("jxx", new Date(2015 - 13 - 6)));
        this.ordersRepository.save(new Orders("jxx", new Date(2014 - 16 - 2)));
        Orders o1 =   this.ordersRepository.findByOrderId(1L);
        Orders o2 =   this.ordersRepository.findByOrderId(2L);
        Orders o3 =   this.ordersRepository.findByOrderId(3L);
        

        this.staffRepository.save(new Staff("John", "0935479424", "B5814823", "Suranaree", "7313"));
        this.staffRepository.save(new Staff("jao", "0935479424", "B5814824", "Suranaree1", "73134"));
        this.staffRepository.save(new Staff("kmo", "085209766", "B5814825", "Suranaree2", "73135"));
        Staff s1 = this.staffRepository.findByStaffId(1L);
        Staff s2 = this.staffRepository.findByStaffId(2L);
        Staff s3 = this.staffRepository.findByStaffId(3L);
        

        this.customerRepository.save(new Customer("John", 20L, "0935479424", "hotmail"));
        this.customerRepository.save(new Customer("jam", 20L, "0919001242", "gmail"));
        this.customerRepository.save(new Customer("Frame", 20L, "0935479424", "hotmail"));

        Customer c1 = this.customerRepository.findByCustomerId(1L);
        Customer c2 = this.customerRepository.findByCustomerId(2L);
        Customer c3 = this.customerRepository.findByCustomerId(3L);

        this.categoryRepository.save(new Category("Khong new"));
        this.categoryRepository.save(new Category("Khong kao"));
        this.categoryRepository.save(new Category("Khong Avaiaible"));
        Category cat1 =  this.categoryRepository.findByCategoryId(1L);
        Category cat2 =  this.categoryRepository.findByCategoryId(2L);
        Category cat3 =  this.categoryRepository.findByCategoryId(3L);
        

        this.provinceRepository.save(new Province("Bankok"));
        this.provinceRepository.save(new Province("Ubon Ratchathani"));
        this.provinceRepository.save(new Province("Korth"));
        
        Province p1 =   this.provinceRepository.findByProvinceId(1L);
        Province p2 =   this.provinceRepository.findByProvinceId(2L);
        Province p3 =   this.provinceRepository.findByProvinceId(3L);

        this.typeItemRepository.save(new TypeItem("Export"));
        this.typeItemRepository.save(new TypeItem("Import"));
        this.typeItemRepository.save(new TypeItem("Avaiaible"));
        
        TypeItem t1 =    this.typeItemRepository.findByTypeId(1L);
        TypeItem t2 =    this.typeItemRepository.findByTypeId(2L);
        TypeItem t3 =    this.typeItemRepository.findByTypeId(3L);





      //  this.bill_of_ladingRepository.save(new Bill_of_lading(s1,i1,t1));
       // this.bill_of_ladingRepository.save(new Bill_of_lading(s2,i2,t2));
       // this.bill_of_ladingRepository.save(new Bill_of_lading(s3,i3,t3));
      ListItem li1 = new ListItem();
      

      
        

    }
}