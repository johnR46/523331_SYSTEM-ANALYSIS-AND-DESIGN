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
    private Long addressId;
    private String customerphone;
    private String customeremail;

    @OneToMany(mappedBy = "customer")
    private List<Posted> posted = new ArrayList<Posted>();

  

    @OneToMany(mappedBy = "customer")
    private List<Orders> orders = new ArrayList<Orders>();

    @OneToMany(mappedBy = "customer")
    private List<CustomerAddress> customerAddress = new ArrayList<CustomerAddress>();

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "genderId")
    private Gender gender;

    private Customer() {
    }

    public Customer(String customerName, Long addressId, String customerphone, String customeremail) {
       
        this.customerName = customerName;
        this.addressId = addressId;
        this.customerphone = customerphone;
        this.customeremail = customeremail;
       

    }

}