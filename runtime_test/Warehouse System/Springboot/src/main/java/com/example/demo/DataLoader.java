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
 //  this.bill_of_ladingRepository.save(new Bill_of_lading(product, typeproduct, user))

       // product data
      this.productRepository.save(new Product("coke", 20.2, 1));


    // typeproduct
        this.typeProductRepository.save(new TypeProduct("export"));
       
    // User
         this.userRepository.save(new User("B5814824","John"));


       
       // test load data in billOfLa
        Product p  = this.productRepository.findByProductId(1L);  //find id =  1   
        TypeProduct t =  this.typeProductRepository.findByTypeId(1L);  //find id =  1 
        User u = this.userRepository.findByUserId(1L);  //find id =  1 
     

        //save billOfLa 
        this.bill_of_ladingRepository.save(new Bill_of_lading(p,t,u));

    }
    
}
