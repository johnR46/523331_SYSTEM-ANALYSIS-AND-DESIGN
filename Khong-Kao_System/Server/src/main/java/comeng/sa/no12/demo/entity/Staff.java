package comeng.sa.no12.demo.entity;

import lombok.*;
import java.util.*;
import javax.persistence.*;

@Entity
@Getter @Setter
@NoArgsConstructor
@ToString @EqualsAndHashCode

@Table(name= "Staff")

public class Staff {






	public Staff(String staffName2, String staffPhone2, String staffAddress2, String staffUserID2,
			String staffPassword2) {
	}


	@Id 
    @SequenceGenerator(name="staff_seq",sequenceName="staff_seq")       
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="staff_seq")      
	@Column(name="Staff_ID",unique = true, nullable = true) 
    private @NonNull Long staffId;
    private @NonNull String staffName;
	private @NonNull String staffPhone;
	private @NonNull String staffAddress;
	private @NonNull String staffUserID;
	private @NonNull String staffPassword;
	//private @NonNull Integer order_id;
	//private @NonNull Integer product_id;
	//private @NonNull String product_name;
	//private @NonNull Integer address_id;
	//private @NonNull Integer customer_id;


	@OneToMany(mappedBy = "staff")
    private List<Delivery> delivery = new ArrayList<Delivery>();
 }
