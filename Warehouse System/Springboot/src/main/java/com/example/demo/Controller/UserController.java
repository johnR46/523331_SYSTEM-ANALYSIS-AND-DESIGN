package com.example.demo.Controller;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
class UserController{
    
    private UserRepository userRepository;
 
    public UserController(UserRepository userRepository){
          this.userRepository = userRepository;
    }

 /* @PostMapping("/Userbody")
    public User bodyUser(@RequestBody User user){
          
            return user;
    }
*/

   @GetMapping("/User-list")
    @CrossOrigin(origins = "http://localhost:4200")
    public Collection<User> userList() {
        return userRepository.findAll().stream()
        .collect(Collectors.toList());
    }


   @GetMapping("/User-list/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public User userFind(@PathVariable("id") Long id) {

        return userRepository.findByUserId(id);
    }
    @GetMapping("/User-list/0/{name}")
    @CrossOrigin(origins = "http://localhost:4200")
    public User userfindname(@PathVariable("name") String name) {

        return userRepository.findByUsername(name);
    }
  

    
  

    @PostMapping("/User-list/{0}/{username}/pass/{pass}")
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<Map<String,Object>> userCheck(@PathVariable("username") String username,@PathVariable("pass") String pass){
    User user = this.userRepository.findByUsernameAndPassword(username,pass);
    if(user!= null){
        Map<String, Object> json = new HashMap<String, Object>();
        json.put("success", true);
        json.put("status", "found");
        json.put("user", user);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json; charset=UTF-8");
        headers.add("X-Fsl-Location", "/");
        headers.add("X-Fsl-Response-Code", "302");
        return  (new ResponseEntity<Map<String, Object>>(json, headers, HttpStatus.OK));
    }else{
        Map<String, Object> json = new HashMap<String, Object>();
        json.put("success", false);
        json.put("status", "not found");

        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json; charset=UTF-8");
        headers.add("X-Fsl-Location", "/");
        headers.add("X-Fsl-Response-Code", "404");
        return  (new ResponseEntity<Map<String, Object>>(json, headers, HttpStatus.OK));
    }

    }




}