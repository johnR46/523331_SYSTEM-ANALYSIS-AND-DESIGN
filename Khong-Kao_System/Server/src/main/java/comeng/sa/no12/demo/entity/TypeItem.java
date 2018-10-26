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
@Table(name = "typeitem")
public class TypeItem {
    @Id
    @SequenceGenerator(name = "typeID_seq", sequenceName = "typeID_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "typeID_seq")
    private Long typeId;

    private String nametype;

    @OneToMany(mappedBy = "typeitem")
    private List<Bill_of_lading> bills = new ArrayList<Bill_of_lading>();

    
private TypeItem(){}
public TypeItem(String nametype){
    this.nametype = nametype;

}


}
