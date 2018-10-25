package comeng.sa.no12.demo.repository;

import comeng.sa.no12.demo.entity.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProvinceRepository extends JpaRepository<Province, Long> {
    Province findByProvinceId(Long provinceId);
}