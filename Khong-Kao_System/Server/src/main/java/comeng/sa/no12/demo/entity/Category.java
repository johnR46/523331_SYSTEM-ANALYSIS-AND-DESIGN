package comeng.sa.no12.demo.entity;

import lombok.*;
import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.*;

@Data
@Entity
@Table(name = "Category") // ชื่อตาราง
public class Category {
    @Id
    @NotNull
    @SequenceGenerator(name = "CategoryId_seq", sequenceName = "CategoryId_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CategoryId_seq")
    private @NonNull Long categoryId;

    private @NonNull String categoryName;

    public Category() {
    }
    public Category(String categoryName) {
        this.categoryName = categoryName;

    }

}