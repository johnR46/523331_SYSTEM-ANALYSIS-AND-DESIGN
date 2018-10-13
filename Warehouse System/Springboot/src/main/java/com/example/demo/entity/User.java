package com.example.demo.entity;
import lombok.*;
import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;




@Entity
@Data 
@Table(name = "User")

public class User {

    @Id  
	@NotNull
	@SequenceGenerator(name="userId_seq",sequenceName="userId_seq")               
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="userId_seq")  
    private @NonNull Long userId;
    
    
    private @NonNull String  username;
    private @NonNull String  password;
    
    
    public User(String username,String password)  {
        this.username = username;
        this.password = password;
  
        
	}





}

