package comeng.sa.no12.demo.repository;

import comeng.sa.no12.demo.entity.CustomerAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:4200")
public interface CustomerAddressRepository extends JpaRepository<CustomerAddress, Long> {
    CustomerAddress findByAddressId(Long addressId);

}