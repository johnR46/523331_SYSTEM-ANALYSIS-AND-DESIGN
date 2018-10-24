package comeng.sa.no12.demo.repository;

import comeng.sa.no12.demo.entity.Orders;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public
interface OrdersRepository extends JpaRepository<Orders, Long> {
    Orders findByOrderId(Long ordersId);
}