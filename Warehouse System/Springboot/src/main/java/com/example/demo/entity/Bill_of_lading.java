package com.example.demo.entity;
import lombok.*;
import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.OneToMany;

import java.time.LocalDate;
import java.util.*;

@Entity
@Data  // lombox จะสร้าง method getter setter ให้เอง

@Table(name="Bill_of_lading") //ชื่อตาราง
public class Bill_of_lading{
	@Id  
	@NotNull
	@SequenceGenerator(name="bill_of_lading_seq",sequenceName="bill_of_lading_seq")               
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="bill_of_lading_seq")  
	private @NonNull Long billId;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "productId", nullable = true)
	private Product product;
	
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "typeId", nullable = true)
	private TypeProduct typeproduct;
		  
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId", nullable = true)
	private User  user;

	@NotNull
	private LocalDate  date;
	private Bill_of_lading(){}

	public Bill_of_lading(Product product,TypeProduct typeproduct,User user ){
		this.product = product;
		this.typeproduct = typeproduct;
		this.user = user;
		this.date = LocalDate.now();
	
	}

}


