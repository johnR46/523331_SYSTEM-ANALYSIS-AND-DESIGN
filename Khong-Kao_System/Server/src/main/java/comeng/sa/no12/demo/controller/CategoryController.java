package comeng.sa.no12.demo.controller;

import comeng.sa.no12.demo.entity.Category;
import comeng.sa.no12.demo.repository.CategoryRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
class CategoryController {

    private CategoryRepository categoryRepository;

    public CategoryController(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;

    }

    @GetMapping("/Category-list")
    @CrossOrigin(origins = "http://localhost:4200")
    public Collection<Category> CategoryList() {
        return categoryRepository.findAll().stream().collect(Collectors.toList());

    }

}