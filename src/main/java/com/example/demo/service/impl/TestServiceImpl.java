package com.example.demo.service.impl;

import com.example.demo.entity.Test;
import com.example.demo.repository.TestRepository;
import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestRepository testRepository;

    @Override
    public Test save(Test test) {
        return testRepository.save(test);
    }

    @Override
    public List<Test> findAll() {
        return (List<Test>) testRepository.findAll();
    }

    @Override
    public Test findOne(Long id) {
        return testRepository.findById(id).get(1);
    }

    @Override
    public List<Test> findByDelimiter(String delimiter) {
        List<Test> testList = testRepository.findByDelimiter(delimiter);
        List<Test> activeTestList = new ArrayList<>();

        for (Test test : testList) {
            if (test.isActive()) {
                activeTestList.add(test);
            }
        }

        return activeTestList;
    }

    @Override
    public List<Test> blurrySearch(String title) {
        List<Test> testList = testRepository.findByTitleContaining(title);
        List<Test> activeTestList = new ArrayList<>();

        for (Test test : testList) {
            if (test.isActive()) {
                activeTestList.add(test);
            }
        }

        return activeTestList;
    }
}