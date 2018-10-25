package comeng.sa.no12.demo.entity;

import lombok.*;
import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "Posted")
public class Posted {
    @Id
    @NotNull
    @SequenceGenerator(name = "postedId_seq", sequenceName = "postedId_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "postedId_seq")
    private @NonNull Long postedId;

    @ManyToOne(fetch = FetchType.EAGER) // set fetch data เป็น LAZY LAZY = fetch when // needed EAGER = fetch                              // immediately
    @JoinColumn(name = "detailsId", insertable = true) // join colume video_id จาก video กับ entity comment
    private Details details;
    
    @ManyToOne(fetch = FetchType.EAGER) // set fetch data เป็น LAZY LAZY = fetch when                           // needed EAGER = fetch immediately
    @JoinColumn(name = "categoryId", insertable = true) // join colume video_id จาก video กับ entity comment
    private Category category;

    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "customerId", insertable = true)
    private Customer customer;


    @NonNull
    private LocalDate date;

    public Posted(Details details,Category category,Customer customer ) {
        this.details = details;
        this.category = category;
        this.customer = customer;
        this.date = LocalDate.now();

    }
}
