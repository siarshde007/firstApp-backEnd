package io.arsh.webapp.myfirstwebapp.config;

import io.arsh.webapp.myfirstwebapp.domain.User;
import io.arsh.webapp.myfirstwebapp.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {
    @Autowired
    private UserRepo repo;

    @Bean
    CommandLineRunner runner(){
        return args -> {
            repo.save(new User("ArshdeepSingh","Singh@gmail.com"));
            repo.save(new User("HarneetKaur","Kaur@gmail.com"));
            repo.save(new User("HarkiratGrewal","grewal@gmail.com"));
        };

    }
}
