package io.arsh.webapp.myfirstwebapp.service;

import io.arsh.webapp.myfirstwebapp.domain.User;
import io.arsh.webapp.myfirstwebapp.repo.UserRepo;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@Service
public class UserService {
    private UserRepo repo;

    public UserService(UserRepo repo) {
        this.repo = repo;
    }
    public List<User> getUsers(){
        return repo.findAll();
    }

    public User createUser(@RequestBody User user){
        return repo.save(user);
    }
}
