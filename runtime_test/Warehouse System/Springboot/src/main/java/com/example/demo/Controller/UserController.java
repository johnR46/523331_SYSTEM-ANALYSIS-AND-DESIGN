package com.example.demo.Controller;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

/*   @PostMapping("/Userbody")
    public User bodyUser(@RequestBody User user){
          
            return user;
    }
*/

 /*   @GetMapping("/User-list")
    @CrossOrigin(origins = "http://localhost:4200")
    public Collection<User> userList() {
        return userRepository.findAll().stream()
        .collect(Collectors.toList());
    }
*/

  /* @GetMapping("/User-list/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public User userFind(@PathVariable("id") Long id) {

        return userRepository.findByUserId(id);
    }
*/

}