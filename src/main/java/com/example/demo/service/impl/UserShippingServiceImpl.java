package com.example.demo.service.impl;


import com.example.demo.entity.UserShipping;
import com.example.demo.repository.UserShippingRepository;
import com.example.demo.service.UserShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserShippingServiceImpl implements UserShippingService {
    @Autowired
    private UserShippingRepository userShippingRepository;

//    public UserShipping findById(Long id) {
//        return userShippingRepository.findById(id).get();
//    }
//
//    @Override
//    public void removeById(Long id) {
//        userShippingRepository.deleteById(id);
//    }

}
