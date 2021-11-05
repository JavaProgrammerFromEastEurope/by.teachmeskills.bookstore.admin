package com.example.demo.service;

import com.example.demo.entity.ShippingAddress;
import com.example.demo.entity.UserShipping;
import org.springframework.stereotype.Service;

@Service
public interface ShippingAddressService {

    ShippingAddress setByUserShipping(UserShipping userShipping, ShippingAddress shippingAddress);
}
