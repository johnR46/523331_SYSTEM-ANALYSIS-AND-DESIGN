package comeng.sa.no12.demo.repository;

import comeng.sa.no12.demo.entity.Delivery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public
interface DeliveryRepository extends JpaRepository<Delivery, Long> {
     Delivery findByDeliveryId(Long deliveryId);
}
