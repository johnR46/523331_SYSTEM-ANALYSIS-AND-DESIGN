package comeng.sa.no12.demo.entity;

import lombok.*;
import java.util.*;
import javax.persistence.*;

@Entity
@Getter @Setter

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
    //private @NonNull String phone;
    //private @NonNull String email;
    
    public CustomerAddress(){}

    public CustomerAddress(Long addressId,String customerAddress,String customerAddress2,
    String district,String city,String country,int zipCode){
        this.addressId = addressId;
        this.customerAddress = customerAddress;
        this.customerAddress2 = customerAddress2;
        this.district = district;
        this.city = city;
        this.country = country;
        this.zipCode = zipCode;

    }

	@OneToMany(mappedBy = "customerAddress")
    private List<Orders> orders = new ArrayList<Orders>();

	 @ManyToOne(fetch = FetchType.LAZY)
     @JoinColumn(name = "Customer")
     private Customer customer;

	 @ManyToOne(fetch = FetchType.LAZY)
     @JoinColumn(name = "Delivery")
     private Delivery delivery;

}
