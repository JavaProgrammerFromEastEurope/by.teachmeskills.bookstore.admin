package com.example.demo.repository;


import com.example.demo.entity.Information;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InformationRepository extends CrudRepository<Information, Long> {
    List<Information> findByDescription(String description);
    List<Information> findById(Long id);
    List<Information> findByTitleContaining(String title);
}
