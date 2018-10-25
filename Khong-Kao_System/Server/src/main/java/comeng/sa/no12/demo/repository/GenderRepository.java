package comeng.sa.no12.demo.repository;

import comeng.sa.no12.demo.entity.Gender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface GenderRepository extends JpaRepository<Gender, Long> {
    Gender findByGenderId(Long genderId);
}