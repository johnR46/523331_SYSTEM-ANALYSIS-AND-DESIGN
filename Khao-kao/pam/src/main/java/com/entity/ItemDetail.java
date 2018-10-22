package com.entity;

import lombok.*;

import javax.persistence.*;
import javax.persistence.JoinColumn;

import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import java.util.*;




@Entity
@Data
@Table(name="ItemDetail") //ชื่อตาราง
public class ItemDetail {
    @Id
    @NotNull
    @SequenceGenerator(name="Itemdetail_Id",sequenceName="Itemdetail_Id")               
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="Itemdetail_Id") 
    
    //@Column(name = "ItemDetailId")
    private @NonNull Long itemId;

    private @NonNull String item_name;
    private @NonNull Integer price;
    private @NonNull String ItemDescription;
    private @NonNull String image;
    //manytoone with video
@ManyToOne(fetch = FetchType.EAGER, targetEntity=Category.class)   //set fetch data เป็น LAZY LAZY = fetch when needed EAGER = fetch immediately
@JoinColumn(name= "category_id", insertable=true)      // join colume video_id จาก video กับ entity comment
private Category category;

@ManyToOne(fetch = FetchType.EAGER, targetEntity=Customer.class)   //set fetch data เป็น LAZY LAZY = fetch when needed EAGER = fetch immediately
@JoinColumn(name= "customer_id", insertable=true)      // join colume video_id จาก video กับ entity comment
private Customer customer;

public ItemDetail(String item_name,Integer price,String ItemDescription,String image){
    this.item_name = item_name;

    this.price = price;
    this.ItemDescription = ItemDescription;
    this.image = image;
}



}
