package io.arsh.webapp.myfirstwebapp.controller;

import io.arsh.webapp.myfirstwebapp.domain.User;
import io.arsh.webapp.myfirstwebapp.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:63488")
@RequestMapping("/api/user")
public class UserController {
    private UserService service;

    public UserController(UserService service) {
        this.service = service;
    }
    @GetMapping()
    public List<User> getUsers(){
        return service.getUsers();
    }
    @PostMapping()
    public User createUser(@RequestBody User user){
        return service.createUser(user);
    }
}
