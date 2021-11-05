package com.example.demo.service;

import com.example.demo.entity.ShoppingCart;
import org.springframework.stereotype.Service;

@Service
public interface ShoppingCartService {
    ShoppingCart updateShoppingCart(ShoppingCart shoppingCart);

    void clearShoppingCart(ShoppingCart shoppingCart);
}
