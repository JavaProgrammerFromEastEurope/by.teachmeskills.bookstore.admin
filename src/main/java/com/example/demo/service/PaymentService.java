package com.example.demo.service;


import com.example.demo.entity.Payment;
import com.example.demo.entity.UserPayment;
import org.springframework.stereotype.Service;

@Service
public interface PaymentService {

    Payment setByUserPayment(UserPayment userPayment, Payment payment);
}
