package com.example.demo.service;

import com.example.demo.entity.Test;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TestService {

    Test save(Test test);

    List<Test> findAll();

    Test findOne(Long id);

    List<Test> findByDelimiter(String delimiter);

    List<Test> blurrySearch(String title);
}
