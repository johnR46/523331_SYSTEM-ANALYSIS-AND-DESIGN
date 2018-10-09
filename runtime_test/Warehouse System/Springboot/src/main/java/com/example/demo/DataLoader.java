package com.example.demo;
import com.example.demo.repository.*;
import com.example.demo.entity.*;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.ApplicationArguments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Date;

@Component
public class DataLoader implements ApplicationRunner {

    private  Bill_of_ladingRepository bill_of_ladingRepository;
    private  ProductRepository productRepository;
    private  TypeProductRepository typeProductRepository;
    private  UserRepository userRepository;
 
    @Autowired
    public DataLoader(Bill_of_ladingRepository bill_of_ladingRepository, ProductRepository productRepository, TypeProductRepository typeProductRepository, UserRepository userRepository) {
        this.bill_of_ladingRepository = bill_of_ladingRepository;
        this.productRepository = productRepository;
        this.typeProductRepository = typeProductRepository;
        this.userRepository = userRepository;
       
    }



    @Override
    public void run(ApplicationArguments args) throws Exception {


        //Bill_of_lading
        this.bill_of_ladingRepository.save(new Bill_of_lading("20",1));

       // product data
        this.productRepository.save(new Product("Coke", 20, 1));
        this.productRepository.save(new Product("Acer", 10, 2));
        this.productRepository.save(new Product("Asus", 1, 2));
        this.productRepository.save(new Product("Dell", 5, 3));
    
    
    // typeproduct
        this.typeProductRepository.save(new TypeProduct("export"));
        this.typeProductRepository.save(new TypeProduct("import"));
         this.typeProductRepository.save(new TypeProduct("import"));
         this.typeProductRepository.save(new TypeProduct("export"));
    // User
         this.userRepository.save(new User("B5814824","John"));
         this.userRepository.save(new User("ss","dd"));
         this.userRepository.save(new User("xx","gg"));
         this.userRepository.save(new User("hjh","sss"));
    
         

    }
    
}
