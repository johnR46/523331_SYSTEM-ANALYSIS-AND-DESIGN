package com.example.demo.entity;
import lombok.*;
import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.OneToMany;
import java.util.*;




@Entity
@Data  // lombox จะสร้าง method getter setter ให้เอง
@Table(name="bill_of_lading") //ชื่อตาราง
public class Bill_of_lading{
	@Id
    @GeneratedValue
	private @NonNull Long id;
	@NotNull
    @Size(max = 65)
    @Column(name = "price")
	private @NonNull String price;
	@NotNull
    @Size(max = 65)
    @Column(name = "qty")
	private @NonNull int qty;
	@NotNull
    @Size(max = 65)
    @Column(name = "Date")
	private @NonNull Date date;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Product> product = new HashSet<>();
	
	  
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "typeproduct", nullable = true)
	private Bill_of_lading bill_of_lading;
	
		  
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "User", nullable = true)
    private Bill_of_lading bill_of_lading2;




	

	public Bill_of_lading(String price,int  qty,Date date){
		this.price = price;
		this.qty = qty;
		this.date = date;

	
	}

	
}



