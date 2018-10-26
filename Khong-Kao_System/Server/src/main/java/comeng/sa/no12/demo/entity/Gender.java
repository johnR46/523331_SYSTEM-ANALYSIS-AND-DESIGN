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
@Table(name = "gender")
public class Gender {
    @Id
    @NotNull
    @SequenceGenerator(name = "GenderId_seq", sequenceName = "GenderId_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GenderId_seq")
    private  Long genderId;
    private  String sex;

    
    @OneToMany(mappedBy = "gender")
    private List<Customer> customer = new ArrayList<Customer>();

    private Gender() {
    }
    public Gender(String sex){
        this.sex = sex;
    }



}
