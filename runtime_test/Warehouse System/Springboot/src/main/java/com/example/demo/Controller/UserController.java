package com.example.demo.Controller;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
class UserController{
    
    private UserRepository userRepository;
 
    public UserController(UserRepository userRepository){
          this.userRepository = userRepository;
    }
    @GetMapping("/User-list")
    @CrossOrigin(origins = "http://localhost:4200")
    public Collection<User> userList() {
        return userRepository.findAll().stream()
        .collect(Collectors.toList());
    }
}