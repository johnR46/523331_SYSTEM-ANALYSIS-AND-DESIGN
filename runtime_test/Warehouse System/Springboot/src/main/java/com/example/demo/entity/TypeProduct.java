package com.example.demo.entity;
import lombok.*;
import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


@Entity
@Data 
@Table(name = "TypeProduct")
public class TypeProduct {
    @Id  
	@NotNull
	@SequenceGenerator(name="typeID_seq",sequenceName="typeID_seq")               
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="typeID_seq")  
    private @NonNull Long typeID;
    
    
    
    private @NonNull  String nametype;   
    public TypeProduct(String nametype )  {
        this.typeID = typeID;
        this.nametype = nametype;
      
  
        
	}





}

