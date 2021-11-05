package com.example.demo.service;

import com.example.demo.entity.Information;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface InformationService {

    Information save(Information information);

    List<Information> findAll();

    Information findOne(Long id);

    List<Information> findByDescription(String delimiter);

    List<Information> blurrySearch(String title);
}
