package comeng.sa.no12.demo.controller;

import comeng.sa.no12.demo.entity.Posted;
import comeng.sa.no12.demo.repository.CategoryRepository;
import comeng.sa.no12.demo.repository.CustomerRepository;
import comeng.sa.no12.demo.repository.DetailsRepository;
import comeng.sa.no12.demo.repository.PostedRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
class PostedController {
    private PostedRepository postedRepository;
    private DetailsRepository detailsRepository;
    private CategoryRepository categoryRepository;
    private CustomerRepository customerRepository;

    public PostedController(PostedRepository postedRepository, DetailsRepository detailsRepository,
            CategoryRepository categoryRepository, CustomerRepository customerRepository) {
        this.postedRepository = postedRepository;
        this.detailsRepository = detailsRepository;
        this.categoryRepository = categoryRepository;
        this.customerRepository = customerRepository;

    }

    @GetMapping("/Posted-list")
    @CrossOrigin(origins = "http://localhost:4200")
    public Collection<Posted> postedList() {
        return postedRepository.findAll().stream().collect(Collectors.toList());

    }

}
