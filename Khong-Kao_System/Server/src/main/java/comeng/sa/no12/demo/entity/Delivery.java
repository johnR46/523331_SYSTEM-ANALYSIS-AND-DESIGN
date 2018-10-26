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
@Table(name = "delivery")

public class Delivery {
    @Id
    @SequenceGenerator(name = "delivery_seq", sequenceName = "delivery_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "delivery_seq")
    private Long deliveryId;

    private Date deliveryDate;
    private String trackId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "staffId")
    private Staff staff;

    // @ManyToOne(fetch = FetchType.LAZY)
    // @JoinColumn(name = "addressId")
    // private CustomerAddress customerAddress;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ordersId")
    private Orders orders;

    private Delivery() {
    }

    public Delivery(Staff staff, /*CustomerAddress customerAddress, */Orders orders, Date deliveryDate, String trackId) {

        this.staff = staff;
        // this.customerAddress = customerAddress;
        this.orders = orders;
        this.deliveryDate = deliveryDate;
        this.trackId = trackId;

    }

}
