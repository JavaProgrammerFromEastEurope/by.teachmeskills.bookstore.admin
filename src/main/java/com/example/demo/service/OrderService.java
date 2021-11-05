package com.example.demo.service;

import com.example.demo.entity.*;
import org.springframework.stereotype.Service;

@Service
public interface OrderService {

    Order createOrder(ShoppingCart shoppingCart,
                      ShippingAddress shippingAddress,
                      BillingAddress billingAddress,
                      Payment payment,
                      String shippingMethod,
                      User user);

//    Order findOne(Long id);
}
