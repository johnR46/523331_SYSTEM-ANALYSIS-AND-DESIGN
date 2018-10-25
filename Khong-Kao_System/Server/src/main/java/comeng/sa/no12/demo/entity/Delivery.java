package comeng.sa.no12.demo.entity;

import lombok.*;
import java.util.*;
import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@Table(name = "Delivery")

public class Delivery {
    @Id
    @SequenceGenerator(name = "delivery_seq", sequenceName = "delivery_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "delivery_seq")
    @Column(name = "Delivery_ID", unique = true, nullable = true)

    private @NonNull Long deliveryId;
    private @NonNull Date deliveryDate;
    private @NonNull String trackId;

    @OneToMany(mappedBy = "delivery")
    private List<Orders> orders = new ArrayList<Orders>();

    // @OneToMany(mappedBy = "delivery")
    // private List<CustomerAddress> customerAddress = new
    // ArrayList<CustomerAddress>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "addressId")
    private CustomerAddress customerAddress;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "staffId")
    private Staff staff;

}
