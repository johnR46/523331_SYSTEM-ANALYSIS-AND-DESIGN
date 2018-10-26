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
@Table(name = "province")
public class Province {
        @Id
        @SequenceGenerator(name = "provinceId_seq", sequenceName = "provinceId_seq")
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "provinceId_seq")
        private @NonNull Long provinceId;
        private @NonNull String provinceName;

        @OneToMany(mappedBy = "province")
        private List<CustomerAddress> customerAddress = new ArrayList<CustomerAddress>();

        private Province() {

        }

        public Province(String provinceName) {
               this.provinceName = provinceName;
            

        }

}
