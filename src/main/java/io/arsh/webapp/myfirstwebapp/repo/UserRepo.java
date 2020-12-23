package io.arsh.webapp.myfirstwebapp.repo;

import io.arsh.webapp.myfirstwebapp.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {
}
