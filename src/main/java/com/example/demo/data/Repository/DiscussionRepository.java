package com.example.demo.data.Repository;

import com.example.demo.data.DAO.Discussion;
import org.springframework.data.repository.CrudRepository;

public interface DiscussionRepository extends CrudRepository<Discussion, Integer > {
}
