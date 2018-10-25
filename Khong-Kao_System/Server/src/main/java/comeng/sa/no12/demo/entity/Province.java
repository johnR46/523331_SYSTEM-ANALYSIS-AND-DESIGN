package comeng.sa.no12.demo.entity;
import lombok.*;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;



@Entity
@Data // lombox จะสร้าง method getter setter ให้เอง
@Table(name = "Province") // ชื่อตาราง
public class Province {
        @Id
        @NotNull
        @SequenceGenerator(name = "provinceId_seq", sequenceName = "provinceId_seq")
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "provinceId_seq")

        private @NonNull Long provinceId;

        private @NonNull String provinceName;
     

        public Province(String provinceName) {
                this.provinceName = provinceName;
               
        }

}
