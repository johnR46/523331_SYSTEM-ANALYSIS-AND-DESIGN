package com.example.demo.Controller;
import  com.example.demo.entity.*;
import  com.example.demo.entity.Bill_of_lading;
import com.example.demo.repository.Bill_of_ladingRepository;
import com.example.demo.repository.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.CrossOrigin;


@RestController
class Bill_of_ladingController {
    private  Bill_of_ladingRepository bill_of_ladingRepository;
    private  ProductRepository productRepository;
    private  TypeProductRepository typeProductRepository;
    private  UserRepository userRepository;

    public Bill_of_ladingController(Bill_of_ladingRepository bill_of_ladingRepository, ProductRepository productRepository,TypeProductRepository typeProductRepository,UserRepository userRepository) {
        this.bill_of_ladingRepository  = bill_of_ladingRepository;
        this.productRepository = productRepository;
        this.typeProductRepository =  typeProductRepository;
        this.userRepository = userRepository;
     
    }

 /*  @GetMapping("/Bill-list/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public Bill_of_lading billList(@PathVariable("id") Long id) {
        return bill_of_ladingRepository.findByBillId(id);
    }
*/

    @GetMapping("/Bill-list")
    @CrossOrigin(origins = "http://localhost:4200")
    public Collection<Bill_of_lading> billList() {
        return bill_of_ladingRepository.findAll().stream()
        .collect(Collectors.toList());

 




    }
    

  


}
