package comeng.sa.no12.demo.entity;

import lombok.*;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@Data // lombox จะสร้าง method getter setter ให้เอง
@Table(name = "Gender") // ชื่อตาราง
public class Gender {
    @Id
    @NotNull
    @SequenceGenerator(name = "GenderId_seq", sequenceName = "GenderId_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GenderId_seq")

    private @NonNull Long genderId;

    private @NonNull String sex;

    public Gender(String sex) {
        this.sex = sex;

    }

}
