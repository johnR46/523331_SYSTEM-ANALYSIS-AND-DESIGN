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
@Table(name="Product") //ชื่อตาราง

public class Product{
        @Id  
        @NotNull
        @SequenceGenerator(name="product_ID_seq",sequenceName="product_ID_seq")               
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="product_ID_seq")     
        private @NonNull Long product_ID;

 
    private @NonNull String name;
    private @NonNull Double  price;
    private @NonNull int  Qty;
  
      
  //  @ManyToOne(fetch = FetchType.LAZY)
  //  @JoinColumn(name = "bill_of_lading", nullable = true)
 //   private Product product;



public Product(String name , Double price , int Qty){

        this.product_ID = product_ID;
        this.name = name;
        this.price = price;
        this.Qty = Qty;
        
	}


}


