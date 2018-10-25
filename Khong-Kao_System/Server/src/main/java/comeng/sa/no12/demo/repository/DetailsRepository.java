package comeng.sa.no12.demo.repository;
import comeng.sa.no12.demo.entity.Details;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:4200")
public interface DetailsRepository extends JpaRepository<Details, Long> {
    Details findByDetailsId(Long detailsId);
}