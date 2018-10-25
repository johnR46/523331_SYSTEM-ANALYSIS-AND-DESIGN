package comeng.sa.no12.demo.controller;

import comeng.sa.no12.demo.entity.Province;
import comeng.sa.no12.demo.repository.ProvinceRepository;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;
import java.util.stream.Collectors;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
class ProvinceController {
    ProvinceRepository provincerepository;

    public ProvinceController(ProvinceRepository provincerepository) {
        this.provincerepository = provincerepository;
    }

    @GetMapping("/Province-list")
    public Collection<Province> provincesList() {
        return provincerepository.findAll().stream().collect(Collectors.toList());

    }

}
