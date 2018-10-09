package com.example.demo.entity;
import lombok.*;
import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import java.util.*;


@Entity
@Data 
@Table(name = "typeproduct")
public class TypeProduct {
    @Id
    @GeneratedValue
    private @NonNull Long id;
    
    
    
    @NotNull
    @Size(max = 65)
    @Column(name = "nametype")
    private @NonNull  String nametype;

   
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Bill_of_lading> bill_of_lading = new HashSet<>();
	
     
      

    public TypeProduct(String nametype )  {
        this.nametype = nametype;
      
  
        
	}





}

