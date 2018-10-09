package com.example.demo.entity;
import lombok.*;
import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.ManyToOne;

@Entity
@Data  // lombox จะสร้าง method getter setter ให้เอง
@Table(name="product") //ชื่อตาราง
public class Product{
    @Id
    @GeneratedValue
    private @NonNull Long id;

    @NotNull
    @Size(max = 65)
    @Column(name = "name")
    private @NonNull String name;
    private @NonNull int  price;
    private @NonNull int  Qty;
  
      
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bill_of_lading", nullable = true)
    private Product product;



public Product(String name , int price , int Qty){
        this.name = name;
        this.price = price;
        this.Qty = Qty;
        
	}


}


