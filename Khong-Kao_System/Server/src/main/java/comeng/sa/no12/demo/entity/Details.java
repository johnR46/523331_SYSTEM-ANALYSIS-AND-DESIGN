package comeng.sa.no12.demo.entity;

import lombok.*;
import javax.persistence.*;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.*;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import org.hibernate.InstantiationException;

@Entity
@Data
@Table(name = "Details") // ชื่อตาราง
public class Details {
    @Id
    @NotNull
    @SequenceGenerator(name = "DetailsId_seq", sequenceName = "DetailsId_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DetailsId_seq")
    private @NonNull Long detailsId;

    private @NonNull String detailsname;
    private @NonNull Integer price;
    private @NonNull String detailsDescripion;
    private @NonNull String image;

    // manytoone with video
    /*
     * @ManyToOne(fetch = FetchType.EAGER) //set fetch data เป็น LAZY LAZY = fetch
     * when needed EAGER = fetch immediately
     * 
     * @JoinColumn(name= "categoryId", insertable=true) // join colume video_id จาก
     * video กับ entity comment private Category category;
     * 
     * @ManyToOne(fetch = FetchType.EAGER, targetEntity=Customer.class) //set fetch
     * data เป็น LAZY LAZY = fetch when needed EAGER = fetch immediately
     * 
     * @JoinColumn(name= "customerId", insertable=true) // join colume video_id จาก
     * video กับ entity comment private Customer customer;
     * 
     */
    public Details() {
    }

    public Details(String detailsname, Integer price, String itemDescription, String image) {
        this.detailsname = detailsname;
        this.price = price;
        this.detailsDescripion = detailsDescripion;
        this.image = image;

    }
}
