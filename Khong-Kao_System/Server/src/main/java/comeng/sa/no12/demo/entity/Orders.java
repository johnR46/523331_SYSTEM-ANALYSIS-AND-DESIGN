package comeng.sa.no12.demo.entity;

import lombok.*;
import java.util.*;
import javax.persistence.*;


@Entity
@Getter @Setter
@NoArgsConstructor
@ToString @EqualsAndHashCode

@Table(name= "Orders")

public class Orders {
    @Id 
    @SequenceGenerator(name="orders_seq",sequenceName="orders_seq")       
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="orders_seq")      
	@Column(name="Orders_ID",unique = true, nullable = true)

    private @NonNull Long orderId;
	private @NonNull String productName;
    //private @NonNull Integer customer_id;
	//private @NonNull Integer address_id;
	//private @NonNull Integer product_id;
    private @NonNull Date orderDate;
    
    public Orders(Long orderId, String productName){
        this.orderId = orderId;
        this.productName = productName;
    }

	

	 @ManyToOne(fetch = FetchType.LAZY)
     @JoinColumn(name = "CustomerAddress")
     private CustomerAddress customerAddress;

	 @ManyToOne(fetch = FetchType.LAZY)
     @JoinColumn(name = "Customer")
     private Customer customer;

	 @ManyToOne(fetch = FetchType.LAZY)
     @JoinColumn(name = "Delivery")
     private Delivery delivery;
}
