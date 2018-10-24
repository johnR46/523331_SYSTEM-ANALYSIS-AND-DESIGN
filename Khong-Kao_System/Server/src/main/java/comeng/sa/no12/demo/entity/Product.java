package comeng.sa.no12.demo.entity;

import lombok.*;
import java.util.*;
import javax.persistence.*;

@Entity
@Getter @Setter
@NoArgsConstructor
@ToString @EqualsAndHashCode

@Table(name= "Product")

public class Product {
    @Id 
    @SequenceGenerator(name="product_seq",sequenceName="product_seq")       
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="product_seq")      
	@Column(name="Product_ID",unique = true, nullable = true) 

    private @NonNull Long productId;
    private @NonNull String productName;
	private @NonNull Long productType;
    private @NonNull Long productPrice;
    
    

	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Orders")
    private Orders orders;
}
