package comeng.sa.no12.demo.repository;

import comeng.sa.no12.demo.entity.TypeItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TypeItemRepository extends JpaRepository<TypeItem, Long> {
    TypeItem findByTypeId(Long typeId);
}