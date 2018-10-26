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
@Table(name = "staff")

public class Staff {
	@Id
	@SequenceGenerator(name = "staff_seq", sequenceName = "staff_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "staff_seq")
	private Long staffId;
	private String staffName;
	private String staffPhone;
	private String staffAddress;
	private String staffUserID;
	private String staffPassword;

	@OneToMany(mappedBy = "staff")
	private List<Delivery> delivery = new ArrayList<Delivery>();

	@OneToMany(mappedBy = "staff")
	private List<Bill_of_lading> bill = new ArrayList<Bill_of_lading>();

	private Staff() {

	}

	public Staff(String staffName, String staffPhone, String staffAddress,String staffUserID, String staffPassword) {
		this.staffName = staffName;
		this.staffPhone = staffPhone;
		this.staffAddress = staffPhone;
		this.staffUserID = staffUserID;
		this.staffPassword = staffPassword;

	}

}
