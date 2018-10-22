package comeng.sa.no12.demo.repository;

import comeng.sa.no12.demo.entity.Staff;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public
interface StaffRepository extends JpaRepository<Staff, Long> {
    Staff findByStaffId(Long staffId);
}