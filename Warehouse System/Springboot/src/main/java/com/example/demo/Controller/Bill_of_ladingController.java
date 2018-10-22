package com.example.demo.Controller;

import com.example.demo.entity.Bill_of_lading;
import com.example.demo.entity.Product;
import com.example.demo.entity.TypeProduct;
import com.example.demo.entity.User;
import com.example.demo.repository.Bill_of_ladingRepository;
import com.example.demo.repository.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
class Bill_of_ladingController {
    private Bill_of_ladingRepository bill_of_ladingRepository;
    private ProductRepository productRepository;
    private TypeProductRepository typeProductRepository;
    private UserRepository userRepository;

    public Bill_of_ladingController(Bill_of_ladingRepository bill_of_ladingRepository,
            ProductRepository productRepository, TypeProductRepository typeProductRepository,
            UserRepository userRepository) {
        this.bill_of_ladingRepository = bill_of_ladingRepository;
        this.productRepository = productRepository;
        this.typeProductRepository = typeProductRepository;
        this.userRepository = userRepository;

    }

    @GetMapping("/Bill_of_lading-list/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public Bill_of_lading billList(@PathVariable("id") Long id) {
        return bill_of_ladingRepository.findByBillId(id);
    }

    @GetMapping("/Bill_of_lading-list")
    @CrossOrigin(origins = "http://localhost:4200")
    public Collection<Bill_of_lading> bill_of_lading() {
        return bill_of_ladingRepository.findAll().stream().collect(Collectors.toList());
    }

   /* @PostMapping("/Bill_of_lading-insert/{id}/product/{product}/typeproduct/{typeproduct}/user/{user}")
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<Map<String, Object>> BillLadingSubmit(@PathVariable("id") Long id,
            @PathVariable("product") Product product, @PathVariable("typeproduct") TypeProduct typeProduct,
            @PathVariable("user") User user) {
        try {
            Product p =this.productRepository.findByProductId(id);
            TypeProduct t = this.typeProductRepository.findByTypeId(id);
           User u = this.userRepository.findByUserId(id);

            Bill_of_lading bill = new Bill_of_lading(product,typeProduct,user);
            this.bill_of_ladingRepository.save(bill);

            Map<String, Object> json = new HashMap<String, Object>();
                json.put("success", true);
                json.put("status", "save");

                HttpHeaders headers = new HttpHeaders();
                headers.add("Content-Type", "application/json; charset=UTF-8");
                headers.add("X-Fsl-Location", "/");
                headers.add("X-Fsl-Response-Code", "302");
                return  (new ResponseEntity<Map<String, Object>>(json, headers, HttpStatus.OK));

        } catch (NullPointerException e) {
            Map<String, Object> json = new HashMap<String, Object>();
            System.out.println("Error Save CancelReservation");
             json.put("success", false);
             json.put("status", "save-false");

            HttpHeaders headers = new HttpHeaders();
            headers.add("Content-Type", "application/json; charset=UTF-8");
            headers.add("X-Fsl-Location", "/");
            headers.add("X-Fsl-Response-Code", "500");
            return  (new ResponseEntity<Map<String, Object>>(json, headers, HttpStatus.INTERNAL_SERVER_ERROR));

        }
    }

    */
    @PostMapping("/Bill_of_lading-insert/{id}/product/{product}")
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<Map<String, Object>> BillLadingSubmit(@PathVariable("id") Long id,@PathVariable("product") Product product) {
        try {
          //  Product p =this.productRepository.findByProductId(id);
           // TypeProduct t = this.typeProductRepository.findByTypeId(id);
         //  User u = this.userRepository.findByUserId(id);

           // Bill_of_lading bill = new Bill_of_lading(product,typeProduct,user);
           // this.bill_of_ladingRepository.save(bill);
           this.productRepository.save(product);

            Map<String, Object> json = new HashMap<String, Object>();
                json.put("success", true);
                json.put("status", "save");

                HttpHeaders headers = new HttpHeaders();
                headers.add("Content-Type", "application/json; charset=UTF-8");
                headers.add("X-Fsl-Location", "/");
                headers.add("X-Fsl-Response-Code", "302");
                return  (new ResponseEntity<Map<String, Object>>(json, headers, HttpStatus.OK));

        } catch (NullPointerException e) {
            Map<String, Object> json = new HashMap<String, Object>();
            System.out.println("Error Save CancelReservation");
             json.put("success", false);
             json.put("status", "save-false");

            HttpHeaders headers = new HttpHeaders();
            headers.add("Content-Type", "application/json; charset=UTF-8");
            headers.add("X-Fsl-Location", "/");
            headers.add("X-Fsl-Response-Code", "500");
            return  (new ResponseEntity<Map<String, Object>>(json, headers, HttpStatus.INTERNAL_SERVER_ERROR));

        }
    }

}
