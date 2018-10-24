package comeng.sa.no12.demo.entity;

import lombok.*;
import java.util.*;
import javax.persistence.*;

@Entity
@Getter @Setter
@ToString @EqualsAndHashCode
@NoArgsConstructor
@Table(name= "Delivery")

public class Delivery {
    @Id 
    @SequenceGenerator(name="delivery_seq",sequenceName="delivery_seq")       
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="delivery_seq")      
	@Column(name="Delivery_ID",unique = true, nullable = true) 

	private @NonNull Long deliveryId;
	
	private @NonNull Date deliveryDate;
	private @NonNull String trackId;

	//private @NonNull Integer order_id;
	//private @NonNull Integer product_id;
	//private @NonNull String product_name;
	//private @NonNull Integer address_id;
	//private @NonNull Integer customer_id;


	 @OneToMany(mappedBy = "delivery")
     private List<Orders> orders = new ArrayList<Orders>();

	 @OneToMany(mappedBy = "delivery")
     private List<CustomerAddress> customerAddress = new ArrayList<CustomerAddress>();

	 @ManyToOne(fetch = FetchType.LAZY)
     @JoinColumn(name = "Staff")
     private Staff staff;

	// public void setStaffName(String staffName) {
	// }

	// public void setCustomerAddress(String customerAddress) {
	// }

	// public void setCustomerId(Long customerId) {
	// }

	// public void setProductId(Long productId) {
	// }

}
