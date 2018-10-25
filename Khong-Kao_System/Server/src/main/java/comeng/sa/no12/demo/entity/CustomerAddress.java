package comeng.sa.no12.demo.entity;

import lombok.*;
import java.util.*;
import javax.persistence.*;

@Entity
@Getter @Setter
@NoArgsConstructor
@ToString @EqualsAndHashCode
@Table(name= "CustomerAddress")

public class CustomerAddress {
    @Id 
    @SequenceGenerator(name="customerAddress_seq",sequenceName="customerAddress_seq")       
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="customerAddress_seq")      
	@Column(name="Address_ID",unique = true, nullable = true) 
    private Long addressId;
    private String customerAddress;
	private String customerAddress2;
	private String district;
    private String city;
    private String country;
    private Integer zipCode;
    
	//@OneToMany(mappedBy = "customerAddress")
   // private List<Orders> orders = new ArrayList<Orders>();

	 @ManyToOne(fetch = FetchType.LAZY)
     @JoinColumn(name = "customerId")
     private Customer customer;

	 @ManyToOne(fetch = FetchType.LAZY)
     @JoinColumn(name = "deliveryId")
     private Delivery delivery;

     
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "provinceId", insertable = true)
    private Province province;

}
