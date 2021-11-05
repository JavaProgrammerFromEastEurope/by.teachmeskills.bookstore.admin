package com.example.demo.repository;


import com.example.demo.entity.Test;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestRepository extends CrudRepository<Test, Long> {
    List<Test> findByDelimiter(String delimiter);
    List<Test> findById(Long id);
    List<Test> findByTitleContaining(String title);
}
