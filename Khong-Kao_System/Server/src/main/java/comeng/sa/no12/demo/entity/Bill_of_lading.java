package comeng.sa.no12.demo.entity;
import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;
import java.util.*;

@Entity
@Data
@Table(name = "bill_of_lading")
public class Bill_of_lading {

	@Id
	@NotNull
	@SequenceGenerator(name = "bill_of_lading_seq", sequenceName = "bill_of_lading_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bill_of_lading_seq")
	private Long billId;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "staffId", nullable = true)
	private Staff staff;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "itemId", nullable = true)
	private Item item;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "typeId", nullable = true)
	private TypeItem typeitem;
	private  LocalDate date;

	private Bill_of_lading() {
	}

	public Bill_of_lading(Staff staff, Item item, TypeItem typeitem) {
		this.staff = staff;
		this.item =item;
		this.typeitem = typeitem;
		this.date = LocalDate.now();



	}

}
