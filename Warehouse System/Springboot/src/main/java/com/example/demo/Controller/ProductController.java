package com.example.demo.Controller;

import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.HashMap;
import java.util.Map;

@RestController
class ProductController {

    private ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;

    }

    @GetMapping("/Product-list")
    @CrossOrigin(origins = "http://localhost:4200")
    public Collection<Product> productList() {
        return productRepository.findAll().stream().collect(Collectors.toList());
    }

    @GetMapping("/Product-list/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public Product productList(@PathVariable("id") Long id) {
        return productRepository.findByProductId(id);
    }
    @PostMapping("/Product-insert/{id}/name/{name}/price/{price}/qty/{qty}")
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<Map<String, Object>> productSumbit(@PathVariable("id") Long id,@PathVariable("name")String name,@PathVariable("price")Double price,@PathVariable("qty")Integer qty) {
        try {
            // ต้องแก้ตรงไหนวะ 
            // เหลือไร 
            // ยัดใส้่ typeproduct ทำแปป
            

            Product  p = new Product(name,price,qty);

           this.productRepository.save(p);
           
            Map<String, Object> json = new HashMap<String, Object>();
            json.put("success", true);
            json.put("status", "save");

            HttpHeaders headers = new HttpHeaders();
            headers.add("Content-Type", "application/json; charset=UTF-8");
            headers.add("X-Fsl-Location", "/");
            headers.add("X-Fsl-Response-Code", "302");
            return (new ResponseEntity<Map<String, Object>>(json, headers, HttpStatus.OK));

        } catch (NullPointerException e) {
            Map<String, Object> json = new HashMap<String, Object>();
            System.out.println("Error Save CancelReservation");
            json.put("success", false);
            json.put("status", "save-false");

            HttpHeaders headers = new HttpHeaders();
            headers.add("Content-Type", "application/json; charset=UTF-8");
            headers.add("X-Fsl-Location", "/");
            headers.add("X-Fsl-Response-Code", "500");
            return (new ResponseEntity<Map<String, Object>>(json, headers, HttpStatus.INTERNAL_SERVER_ERROR));

        }
    }




   

}