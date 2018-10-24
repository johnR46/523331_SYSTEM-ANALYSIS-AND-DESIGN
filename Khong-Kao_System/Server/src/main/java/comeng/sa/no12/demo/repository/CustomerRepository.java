package comeng.sa.no12.demo.repository;

import comeng.sa.no12.demo.entity.Customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public
interface CustomerRepository extends JpaRepository<Customer, Long> {
	Customer findByCustomerId(Long customerId);
//	Customer findByCustomer_name(String customer_name);

} 