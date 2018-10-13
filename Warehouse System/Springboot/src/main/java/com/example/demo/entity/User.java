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
@Table(name = "User")

public class User {

    @Id  
	@NotNull
	@SequenceGenerator(name="userID_seq",sequenceName="userID_seq")               
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="userID_seq")  
    private @NonNull Long userId;
    
    
    private @NonNull String  username;
    private @NonNull String  password;
    
    
    public User(String username,String password)  {
        this.username = username;
        this.password = password;
  
        
	}





}

