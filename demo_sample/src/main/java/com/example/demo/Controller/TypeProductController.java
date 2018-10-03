package com.example.demo.Controller;
import  com.example.demo.entity.TypeProduct;
import com.example.demo.repository.TypeProductRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
class TypeProductController{
    private TypeProductRepository typeProductRepository;

    public TypeProductController(TypeProductRepository typeProductRepository){
            this.typeProductRepository = typeProductRepository;
    }

    @GetMapping("/TypeProduct-list")
    @CrossOrigin(origins = "http://localhost:4200")
    public Collection<TypeProduct> typeProductList() {
        return typeProductRepository.findAll().stream()
        .collect(Collectors.toList());
    }


}