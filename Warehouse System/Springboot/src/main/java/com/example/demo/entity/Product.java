package com.example.demo.entity;
import lombok.*;
import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


@Entity
@Data  // lombox จะสร้าง method getter setter ให้เอง
@Table(name="Product") //ชื่อตาราง

public class Product{
        @Id  
        @NotNull
        @SequenceGenerator(name="productId_seq",sequenceName="productId_seq")               
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="productId_seq")     
        private @NonNull Long productId;

 
    private @NonNull String name;
    private @NonNull Double  price;
    private @NonNull int  qty;
    
    
  
      


public Product(String name , Double price , int qty){
        this.name = name;
        this.price = price;
        this.qty = qty;
	}


}


