package com.example.demo.data.Repository;

import com.example.demo.data.DAO.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Integer> {
    Optional<User> findByEmailAddress(String emailAddress);
    Optional<User> findById(Integer user_id);
}
