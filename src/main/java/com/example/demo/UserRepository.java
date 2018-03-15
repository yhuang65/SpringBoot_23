package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long>{
    Long countByUsername(String username);
    User findByEmail(String email);
    Long countByEmail(String email);
    User findByUsername(String username);
}
