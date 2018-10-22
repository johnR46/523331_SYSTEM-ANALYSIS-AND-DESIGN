package com.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
@Data

@Table(name = "ItemList")
public class ItemList {
    @Id
    @NotNull
    @SequenceGenerator(name = "ItemlistId_seq", sequenceName = "ItemlistId_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ItemlistId_seq")
    private @NonNull Long list_id;
   

    // private @NonNull Long list_id;
    // private @NonNull Long category_id;
    // private @NonNull Long item_id;
    // private @NonNull Date date;

    @ManyToOne(fetch = FetchType.EAGER, targetEntity = ItemDetail.class) // set fetch data เป็น LAZY LAZY = fetch when
                                                                         // needed EAGER = fetch immediately
    @JoinColumn(name = "item_id", insertable = true) // join colume video_id จาก video กับ entity comment
    private ItemDetail itemdetail;

    @ManyToOne(fetch = FetchType.EAGER, targetEntity = Category.class) // set fetch data เป็น LAZY LAZY = fetch when
                                                                       // needed EAGER = fetch immediately
    @JoinColumn(name = "category_id", insertable = true) // join colume video_id จาก video กับ entity comment
    private Category category;

    @ManyToOne(fetch = FetchType.EAGER, targetEntity = Customer.class)
    @JoinColumn(name = "customer_id", insertable = true)
    private Customer customer;
    
    @NonNull
    private  LocalDate date;
    public ItemList() {
        this.date = LocalDate.now();

    }

}
