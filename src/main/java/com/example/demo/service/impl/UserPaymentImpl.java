package com.example.demo.service.impl;

import com.example.demo.entity.UserPayment;
import com.example.demo.repository.UserPaymentRepository;
import com.example.demo.service.UserPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserPaymentImpl implements UserPaymentService {
    @Autowired
    private UserPaymentRepository userPaymentRepository;

//    public UserPayment findById(Long id) {
//        return userPaymentRepository.findById(id).get();
//    }

//    @Override
//    public void removeById(Long id) {
//        userPaymentRepository.deleteById(id);
//    }

}