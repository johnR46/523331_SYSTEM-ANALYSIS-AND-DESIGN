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
@Table(name = "category")
public class Category {
    @Id
    @NotNull
    @SequenceGenerator(name = "CategoryId_seq", sequenceName = "CategoryId_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CategoryId_seq")

    private Long categoryId;
    private String categoryName;

    @OneToMany(mappedBy = "category")
    private List<Posted> posted = new ArrayList<Posted>();

    private Category() {
    }

    public Category(String categoryName) {
        this.categoryName = categoryName;

    }

}