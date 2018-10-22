package com.controller;
import com.entity.ItemDetail;
import com.repository.ItemDetailRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
class ItemDetailController{
    
    private ItemDetailRepository itemDetailRepository;
 
    public ItemDetailController(ItemDetailRepository itemDetailRepository){
            this.itemDetailRepository = itemDetailRepository;

    }

    @GetMapping("/itemDetail-list")
    @CrossOrigin(origins = "http://localhost:4200")
    public Collection<ItemDetail> ItemDetailList() {
        return itemDetailRepository.findAll().stream()
        .collect(Collectors.toList());

    }

}