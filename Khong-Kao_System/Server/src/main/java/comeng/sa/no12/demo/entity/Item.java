package comeng.sa.no12.demo.entity;
import lombok.*;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;



@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@Data // lombox จะสร้าง method getter setter ให้เอง
@Table(name = "Item") // ชื่อตาราง

public class Item {
        @Id
        @NotNull
        @SequenceGenerator(name = "ItemId_seq", sequenceName = "ItemId_seq")
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ItemId_seq")

        private @NonNull Long itemId;

        private @NonNull String Itemname;
        private @NonNull String Itemdescripton;

        private @NonNull Double price;
        private @NonNull Integer Qty;

      
        public Item(String Itemdescripton,String Itemname, Integer Qty,  Double price,Long itemId) {
                this.itemId = itemId;
                this.Itemname = Itemname;
                this.Itemdescripton = Itemdescripton;
                this.price = price;
                this.Qty = Qty;
        }

}
