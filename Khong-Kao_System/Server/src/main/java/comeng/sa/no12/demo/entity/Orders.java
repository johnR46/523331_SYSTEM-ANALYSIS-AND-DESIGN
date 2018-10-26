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
@Table(name = "orders")
public class Orders {
    @Id
    @SequenceGenerator(name = "orders_seq", sequenceName = "orders_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "orders_seq")
    private Long orderId;

    private Date orderDate;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "customerId")
    private Customer customer;

  
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "listItemId")
    private ListItem listItem;

    private Orders() {
    }

    public Orders(Customer customer,ListItem listItem,Date orderDate) {
       this.customer = customer;
       this.listItem = listItem;
        this.orderDate = orderDate;

    }

}
