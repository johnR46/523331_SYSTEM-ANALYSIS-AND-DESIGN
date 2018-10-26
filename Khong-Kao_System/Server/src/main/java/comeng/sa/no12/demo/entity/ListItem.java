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
@Table(name = "listItem")
public class ListItem {
    @Id
    @SequenceGenerator(name = "listItem_seq", sequenceName = "listItem_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "listItem_seq")
    private Long listItemId;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "itemId")
    private Item item;
   private ListItem() {

    }

    public ListItem( Item  item) {
        this.item = item;
    }

}
