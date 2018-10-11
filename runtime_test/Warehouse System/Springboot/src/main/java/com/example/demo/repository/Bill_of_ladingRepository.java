package com.example.demo.repository;
import com.example.demo.entity. Bill_of_lading;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:4200")
public interface Bill_of_ladingRepository extends JpaRepository<Bill_of_lading, Long> {
    
   Bill_of_lading findByBillId(Long BillId);
}