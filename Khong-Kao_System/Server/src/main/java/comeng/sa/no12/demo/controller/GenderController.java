package comeng.sa.no12.demo.controller;

import comeng.sa.no12.demo.entity.Gender;
import comeng.sa.no12.demo.repository.GenderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;
import java.util.stream.Collectors;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
class GenderController {
    @Autowired
    GenderRepository genderrepository;

    public GenderController(GenderRepository genderrepository) {
        this.genderrepository = genderrepository;
    }

    @GetMapping("/Gender-list")
    public Collection<Gender> genderList() {
        return genderrepository.findAll().stream().collect(Collectors.toList());

    }


    @GetMapping("/Gender/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public Gender Itemfind(@PathVariable("id") Long id) {
        return genderrepository.findByGenderId(id);
    }

}
