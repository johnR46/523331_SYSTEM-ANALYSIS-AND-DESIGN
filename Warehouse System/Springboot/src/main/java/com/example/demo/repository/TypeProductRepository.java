package com.example.demo.repository;
import com.example.demo.entity.TypeProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TypeProductRepository extends JpaRepository<TypeProduct, Long> {
    TypeProduct findByTypeId(Long typeId);
}