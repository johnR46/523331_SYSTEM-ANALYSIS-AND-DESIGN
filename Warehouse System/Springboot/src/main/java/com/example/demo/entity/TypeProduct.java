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
	@SequenceGenerator(name="typeId_seq",sequenceName="typeId_seq")               
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="typeId_seq")  
    private @NonNull Long typeId;
    
    
    
    private @NonNull  String nametype;   
    public TypeProduct(String nametype )  {
        this.nametype = nametype;
        
	}





}

