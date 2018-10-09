package com.example.demo.Controller;
import  com.example.demo.entity.Product;
import  com.example.demo.repository.ProductRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
class  ProductController{
    
    private ProductRepository productRepository;

    public ProductController(ProductRepository productRepository){
            this.productRepository = productRepository;

    }

    @GetMapping("/Product-list")
    @CrossOrigin(origins = "http://localhost:4200")
    public Collection<Product>  productList() {
        return productRepository.findAll().stream()
        .collect(Collectors.toList());

 




    }


}