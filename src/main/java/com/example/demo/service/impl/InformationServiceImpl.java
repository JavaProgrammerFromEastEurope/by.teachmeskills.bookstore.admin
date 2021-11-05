package com.example.demo.service.impl;

import com.example.demo.entity.Information;
import com.example.demo.repository.InformationRepository;
import com.example.demo.service.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InformationServiceImpl implements InformationService {

    @Autowired
    private InformationRepository informationRepository;

    @Override
    public Information save(Information information) {
        return informationRepository.save(information);
    }

    @Override
    public List<Information> findAll() {
        return (List<Information>) informationRepository.findAll();
    }

    @Override
    public Information findOne(Long id) {
        return informationRepository.findById(id).get(1);
    }

    @Override
    public List<Information> findByDescription(String description) {
        List<Information> information = informationRepository.findByDescription(description);
        List<Information> activeInfoList = new ArrayList<>();

        for (Information info : information) {
            if (info.isActive()) {
                activeInfoList.add(info);
            }
        }
        return activeInfoList;
    }

    @Override
    public List<Information> blurrySearch(String title) {
        List<Information> informationList = informationRepository.findByTitleContaining(title);
        List<Information> activeInfoList = new ArrayList<>();

        for (Information information : informationList) {
            if (information.isActive()) {
                activeInfoList.add(information);
            }
        }

        return activeInfoList;
    }
}