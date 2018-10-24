package comeng.sa.no12.demo.repository;

import comeng.sa.no12.demo.entity.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public
interface ProductRepository extends JpaRepository<Product, Long> {
    Product findByProductId(Long productId);
}