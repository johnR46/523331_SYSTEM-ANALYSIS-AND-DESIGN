package com.repository;
import com.entity.ItemDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:4200")
public interface ItemDetailRepository extends JpaRepository<ItemDetail, Long> {
    ItemDetail findByItemDetailId(Long itemId);
} //Customer findByCustomerId(Long customerId);
