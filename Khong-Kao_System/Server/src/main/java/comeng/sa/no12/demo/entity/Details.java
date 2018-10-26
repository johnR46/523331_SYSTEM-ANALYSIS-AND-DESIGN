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
@Table(name = "details")
public class Details {
    @Id
    @NotNull
    @SequenceGenerator(name = "DetailsId_seq", sequenceName = "DetailsId_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DetailsId_seq")

    private Long detailsId;
    private String detailsname;
    private Integer price;
    private String detailsDescripion;
    private String image;

    @OneToMany(mappedBy = "details")
    private List<Posted> posted = new ArrayList<Posted>();

    private Details() {
    }

    public Details(String detailsname, Integer price, String detailsDescripion, String image) {
        this.detailsname = detailsname;
        this.price = price;
        this.detailsDescripion = detailsDescripion;
        this.image = image;

    }

}
