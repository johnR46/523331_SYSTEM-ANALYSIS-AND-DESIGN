package comeng.sa.no12.demo.entity;
import lombok.*;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


@Entity
@Data 
@Table(name = "TypeItem")
public class TypeItem {
    @Id  
	@NotNull
	@SequenceGenerator(name="typeID_seq",sequenceName="typeID_seq")               
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="typeID_seq")  
    private @NonNull Long typeId;
    
    
    
    private @NonNull  String nametype;   
    public TypeItem(String nametype )  {
        this.nametype = nametype;
        
	}





}

