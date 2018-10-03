package com.example.demo.entity;
import lombok.*;
import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.*;


@Entity
@Data 
@Table(name = "typeproduct")
public class TypeProduct {
    @Id
    @GeneratedValue
	private @NonNull Long id;
    private @NonNull int  price;
    private @NonNull int  Qty;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Bill_of_lading> bill_of_lading = new HashSet<>();
	
     
      

    public TypeProduct(int price,Date date,int Qty)  {
        this.price = price;
        this.Qty = Qty;
  
        
	}





}

