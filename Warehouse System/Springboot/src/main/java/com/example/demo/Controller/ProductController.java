package com.example.demo.Controller;
import  com.example.demo.entity.Product;
import  com.example.demo.repository.ProductRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
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
    
    @GetMapping("/Product-list/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public Product  productList(@PathVariable("id") Long id) {
        return productRepository.findByProductId(id);
    }

}