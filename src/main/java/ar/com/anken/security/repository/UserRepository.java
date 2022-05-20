package ar.com.anken.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.anken.security.model.User;


public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
