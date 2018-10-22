package comeng.sa.no12.demo.entity;

import lombok.*;
import java.util.*;
import javax.persistence.*;

@Entity
@Getter @Setter

@ToString @EqualsAndHashCode

@Table(name= "Staff")

public class Staff {
    @Id 
    @SequenceGenerator(name="staff_seq",sequenceName="staff_seq")       
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="staff_seq")      
	@Column(name="Staff_ID",unique = true, nullable = true) 
    private @NonNull Long staffId;
    private @NonNull String staffName;
	private @NonNull String staffPhone;
	private @NonNull String staffAddress;
	//private @NonNull Integer order_id;
	//private @NonNull Integer product_id;
	//private @NonNull String product_name;
	//private @NonNull Integer address_id;
	//private @NonNull Integer customer_id;

	public Staff(){}

	public Staff(Long staffId, String staffName, String staffPhone, String staffAddress) {
		this.staffId = staffId;
		this.staffName = staffName;
		this.staffPhone = staffPhone;
		this.staffAddress = staffAddress;
	}


	@OneToMany(mappedBy = "staff")
    private List<Delivery> delivery = new ArrayList<Delivery>();
 }
