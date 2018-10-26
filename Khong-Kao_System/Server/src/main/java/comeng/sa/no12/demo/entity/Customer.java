package comeng.sa.no12.demo.entity;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import lombok.*;
import java.util.*;

@Entity
@Data
@Table(name = "customer")

public class Customer {

    @Id
    @SequenceGenerator(name = "customer_seq", sequenceName = "customer_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_seq")
    private Long customerId;
    private String customerName;
    private String customerphone;
    private String customeremail;
    private String customerLogin;
    private String customerPassword;
    
    

   
  

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "genderId")
    private Gender gender;

    

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "addressId")
    private CustomerAddress customerAddress;


    private Customer() {
    }

    public Customer(CustomerAddress customerAddress,Gender gender ,String customerName, String customerphone, String customeremail,String customerLogin ,String customerPassword) {
       this.customerAddress =customerAddress;
       this.gender = gender;
        this.customerName = customerName;
        this.customerphone = customerphone;
        this.customeremail = customeremail;
        this.customerLogin = customerLogin;
        this.customerPassword = customerPassword;
       

    }

}