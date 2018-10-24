package comeng.sa.no12.demo.repository;

import comeng.sa.no12.demo.entity.CustomerAddress;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public
interface CustomerAddressRepository extends JpaRepository<CustomerAddress, Long> {
    CustomerAddress findByCustomerAddress(String customerAddress);
}