package comeng.sa.no12.demo.entity;

import lombok.*;
import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.*;
import javax.persistence.Entity;
import java.util.*;


@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Table(name = "ListItem")
public class ListItem  {
    @Id
    @SequenceGenerator(name = "listItem_seq", sequenceName = "listItem_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "listItem_seq")
    @Column(name = "ListItem_ID", unique = true, nullable = true)

    private @NonNull Long listItemId;
 
    // @OneToMany(mappedBy = "ListItem")
    // private List<Item> item = new ArrayList<Item>();

   // @OneToMany(mappedBy = "itemId")
   // private List<Item> item = new ArrayList<Item>();

   // @OneToMany(mappedBy = "listItem")
   // private List<Item> item = new ArrayList<Item>();

    
      
    // @ManyToOne(fetch = FetchType.LAZY)
    // @JoinColumn(name = "Orders")
    // private Orders orders;

}
