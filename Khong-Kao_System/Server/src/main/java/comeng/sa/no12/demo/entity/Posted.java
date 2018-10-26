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
@Table(name = "posted")
public class Posted {
    @Id
    @SequenceGenerator(name = "postedId_seq", sequenceName = "postedId_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "postedId_seq")
    private Long postedId;

    

    @ManyToOne(fetch = FetchType.EAGER) // set fetch data เป็น LAZY LAZY = fetch when // needed LAZY = fetch //                           // immediately
    @JoinColumn(name = "detailsId", insertable = true) // join colume video_id จาก video กับ entity comment
    private Details details;

    @ManyToOne(fetch = FetchType.EAGER) // set fetch data เป็น LAZY LAZY = fetch when // needed LAZY = fetch // immediately
    @JoinColumn(name = "categoryId", insertable = true) // join colume video_id จาก video กับ entity comment
    private Category category;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "customerId", insertable = true)
    private Customer customer;

    private LocalDate  date;
    private Posted() {}

    public Posted(Details details, Category category, Customer customer) {
        this.details = details;
        this.category = category;
        this.customer = customer;
        this.date = LocalDate.now();
    }

}
