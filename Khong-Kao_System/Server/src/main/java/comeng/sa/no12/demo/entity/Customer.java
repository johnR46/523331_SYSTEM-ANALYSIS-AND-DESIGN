package comeng.sa.no12.demo.entity;
import lombok.*;
import java.util.*;
import javax.persistence.*;



@Entity
@Data
@Getter @Setter
@NoArgsConstructor
@ToString @EqualsAndHashCode

@Table(name= "customer")

public class Customer {
    
    @Id 
    @SequenceGenerator(name="customer_seq",sequenceName="customer_seq")       
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="customer_seq")      
	@Column(name="Customer_ID",unique = true, nullable = true) 
    private Long customerId;
    
    private String customerName;
	private Long addressId;
    private String customerphone;
    private String customeremail;

	@OneToMany(mappedBy = "customer")
    private List<CustomerAddress> customerAddress = new ArrayList<CustomerAddress>();

	@OneToMany(mappedBy = "customer")
    private List<Orders> orders = new ArrayList<Orders>();

   
        
    
}