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
@Table(name = "item")

public class Item {
        @Id
        @SequenceGenerator(name = "item_seq", sequenceName = "item_seq")
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "item_seq")
        private  Long itemId;

        private  String Itemname;
        private  String Itemdescripton;
        private  Double price;
        private  Integer Qty;

		
private Item(){}
public Item(String Itemname,String Itemdescripton, Double price,Integer Qty){
        this.Itemname = Itemname;
        this.Itemdescripton = Itemdescripton;
        this.price = price;
        this.Qty = Qty;
        

}
}
