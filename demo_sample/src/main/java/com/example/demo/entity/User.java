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
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue
	private @NonNull Long id;
    private @NonNull String  username;


    
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Bill_of_lading> bill_of_lading = new HashSet<>();
    
    
    public User(String username)  {
        this.username = username;
    
  
        
	}





}

