package com.entity;

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
@Table(name = "Customer")

public class Customer {

    @Id
    @NotNull
    @SequenceGenerator(name = "customer_seq", sequenceName = "customer_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_seq")
    private @NonNull Long customerId;

    private @NonNull String customer_name;
    private @NonNull String username;
    private @NonNull String password;
    private @NonNull Long address_id;
    private @NonNull String birthday;
    private @NonNull String gender;
    private @NonNull String email;
    private @NonNull String phonenumber;

    public Customer(String customer_name, String username, String password, String birthday,
            String gender, String email, String phonenumber) {
        this.customer_name = customer_name;
        this.username = username;
        this.password = password;
        
        this.birthday = birthday;
        this.gender = gender;
        this.email = email;
        this.phonenumber = phonenumber;
    }

}