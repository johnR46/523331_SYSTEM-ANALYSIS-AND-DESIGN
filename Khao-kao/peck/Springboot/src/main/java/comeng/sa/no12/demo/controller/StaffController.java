package comeng.sa.no12.demo.controller;

import comeng.sa.no12.demo.entity.Staff;
import comeng.sa.no12.demo.repository.StaffRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;


@RestController
class StaffController {
    @Autowired 
    private StaffRepository staffRepository;

    public StaffController(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    @GetMapping("/Staffs")
    public Collection<Staff> Staff(){
        return staffRepository.findAll().stream().collect(Collectors.toList());
		}
    
}
 