package comeng.sa.no12.demo.entity;

import lombok.*;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@Data
@Getter @Setter

@ToString @EqualsAndHashCode

@Table(name= "customer")

public class Customer {
    
    @Id 
    @SequenceGenerator(name="customer_seq",sequenceName="customer_seq")       
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="customer_seq")      
	@Column(name="Customer_ID",unique = true, nullable = true) 
    private Long customerId;
    
    private String customerName;
	private int addressId;
    private String customerphone;
    private String customeremail;
	//private @NonNull String username;
    //private @NonNull String password;

    public Customer(){}

    public Customer(String customerName,String customerphone, String customeremail,int addressId){
        this.customerName = customerName;
        this.customerphone = customerphone;
        this.customeremail = customeremail;
        this.addressId = addressId;

    }

	@OneToMany(mappedBy = "customer")
    private List<CustomerAddress> customerAddress = new ArrayList<CustomerAddress>();

	@OneToMany(mappedBy = "customer")
    private List<Orders> orders = new ArrayList<Orders>();

   
        
    
}