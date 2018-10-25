package comeng.sa.no12.demo.controller;
import comeng.sa.no12.demo.entity.*;
import comeng.sa.no12.demo.repository.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
class DetailsController{
    
    private DetailsRepository detailsRepository;
 
    public DetailsController(DetailsRepository detailsRepository){
            this.detailsRepository = detailsRepository;

    }

    @GetMapping("/Details-list")
    @CrossOrigin(origins = "http://localhost:4200")
    public Collection<Details> detailsList() {
        return detailsRepository.findAll().stream()
        .collect(Collectors.toList());

    }

}