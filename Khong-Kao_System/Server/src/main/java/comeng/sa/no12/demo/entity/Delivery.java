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
    @Column(name = "Delivery_ID", unique = true, nullable = true)

    private Long deliveryId;
    private Date deliveryDate;
    private String trackId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "staffId")
    private Staff staff;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "addressId")
    private CustomerAddress customerAddress;

    @OneToMany(mappedBy = "delivery")
    private List<Orders> orders = new ArrayList<Orders>();
    

    private Delivery() {
    }

    public Delivery(Date deliveryDate, String trackId) {
        this.deliveryDate = deliveryDate;
        this.trackId = trackId;


    }

}
