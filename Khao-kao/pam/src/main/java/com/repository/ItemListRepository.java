package com.repository;
import com.entity.ItemList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ItemListRepository extends JpaRepository<ItemList, Long> {
    
}