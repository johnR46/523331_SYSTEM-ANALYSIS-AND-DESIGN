package comeng.sa.no12.demo.entity;
import lombok.*;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;



@Entity
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
        private @NonNull Double Qty;

        public Item(String Itemname, String Itemdescripton, Double price, Double Qty) {
                this.Itemname = Itemname;
                this.Itemdescripton = Itemdescripton;
                this.price = price;
                this.Qty = Qty;
        }

}
