package comeng.sa.no12.demo.controller;

import comeng.sa.no12.demo.entity.Staff;
import comeng.sa.no12.demo.repository.StaffRepository;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
class StaffController {
    @Autowired
    private StaffRepository staffRepository;

    public StaffController(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    @GetMapping("/Staffs")
    @CrossOrigin(origins = "http://localhost:4200")
    public Collection<Staff> Staff() {
        return staffRepository.findAll().stream().collect(Collectors.toList());
    }

    @GetMapping("/Staffs/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public Staff staffFind(@PathVariable("id") Long id) {
        return staffRepository.findByStaffId(id);
    }

    @GetMapping("/Staffs/staffName/{staffName}")
    @CrossOrigin(origins = "http://localhost:4200")
    public Staff staffname(@PathVariable("staffName") String name) {

        return staffRepository.findBystaffName(name);
    }

    @GetMapping("/Staffs/staffUserID/{staffUserID}")
    @CrossOrigin(origins = "http://localhost:4200")
    public Staff staffUserID(@PathVariable("staffUserID") String staffUserID) {

        return staffRepository.findBystaffUserID(staffUserID);
    }

    @GetMapping("/Staffs/staffPassword/{staffPassword}")
    @CrossOrigin(origins = "http://localhost:4200")
    public Staff staffPassword(@PathVariable("staffPassword") String staffPassword) {

        return staffRepository.findBystaffPassword(staffPassword);
    }



    @PostMapping("/Staffs/staffUserID/{staffUserID}/staffPassword/{staffPassword}")
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<Map<String, Object>> userCheck(@PathVariable("staffUserID") String staffUserID,
            @PathVariable("staffPassword") String staffPassword) {
        Staff staff = this.staffRepository.findBystaffUserID(staffUserID);
        Staff staff2 = this.staffRepository.findBystaffPassword(staffPassword);

        if ((staff != null) && (staff2 != null)) {
            Map<String, Object> json = new HashMap<String, Object>();
            json.put("success", true);
            json.put("status", "found");
            json.put("user", staff);
            HttpHeaders headers = new HttpHeaders();
            headers.add("Content-Type", "application/json; charset=UTF-8");
            headers.add("X-Fsl-Location", "/");
            headers.add("X-Fsl-Response-Code", "302");
            return (new ResponseEntity<Map<String, Object>>(json, headers, HttpStatus.OK));
        } else {
            Map<String, Object> json = new HashMap<String, Object>();
            json.put("success", false);
            json.put("status", "not found");

            HttpHeaders headers = new HttpHeaders();
            headers.add("Content-Type", "application/json; charset=UTF-8");
            headers.add("X-Fsl-Location", "/");
            headers.add("X-Fsl-Response-Code", "404");
            return (new ResponseEntity<Map<String, Object>>(json, headers, HttpStatus.OK));
        }

    }

}
