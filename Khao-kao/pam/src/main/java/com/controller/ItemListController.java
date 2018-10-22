package com.controller;
import  com.entity.*;
import com.repository.CategoryRepository;
import com.repository.CustomerRepository;
import com.repository.ItemDetailRepository;
import com.repository.ItemListRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
class ItemListController {
    private  ItemListRepository itemListRepository;
    private  ItemDetailRepository itemDetailRepository;
    private  CategoryRepository categoryRepository;
    private  CustomerRepository customerRepository;

    public ItemListController(ItemListRepository itemListRepository, ItemDetailRepository itemDetailRepository,CategoryRepository categoryRepository,CustomerRepository customerRepository) {
        this.itemListRepository  =itemListRepository;
        this.itemDetailRepository = itemDetailRepository;
        this.categoryRepository =  categoryRepository;
        this.customerRepository = customerRepository;
     
    }

    @GetMapping("/itemList-list")
    @CrossOrigin(origins = "http://localhost:4200")
    public Collection<ItemList> itemList() {
        return itemListRepository.findAll().stream()
        .collect(Collectors.toList());

    }

}
