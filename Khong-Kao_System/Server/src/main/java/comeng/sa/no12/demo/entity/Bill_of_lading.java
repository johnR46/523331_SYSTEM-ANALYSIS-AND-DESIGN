package comeng.sa.no12.demo.entity;

import lombok.*;
import java.time.LocalDate;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data // lombox จะสร้าง method getter setter ให้เอง

@Table(name = "Bill_of_lading")
public class Bill_of_lading {
	@Id
	@NotNull
	@SequenceGenerator(name = "bill_of_lading_seq", sequenceName = "bill_of_lading_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bill_of_lading_seq")
	private @NonNull Long billId;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "staffId", nullable = true)
	private Staff staff;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "itemId", nullable = true)
	private Item item;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "typeId", nullable = true)
	private TypeItem typeitem;

	@NotNull
	private LocalDate date;

	private Bill_of_lading() {
	}

	public Bill_of_lading(Item item, TypeItem typeitem, Staff staff) {

		this.item = item;
		this.typeitem = typeitem;
		this.staff = staff;
		this.date = LocalDate.now();

	}

}
