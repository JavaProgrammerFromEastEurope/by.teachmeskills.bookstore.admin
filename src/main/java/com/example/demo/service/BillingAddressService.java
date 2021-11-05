package com.example.demo.service;


import com.example.demo.entity.BillingAddress;
import com.example.demo.entity.UserBilling;
import org.springframework.stereotype.Service;

@Service
public interface BillingAddressService {

    BillingAddress setByUserBilling(UserBilling userBilling, BillingAddress billingAddress);
}
