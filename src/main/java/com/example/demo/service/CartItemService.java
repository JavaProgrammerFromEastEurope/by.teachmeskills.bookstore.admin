package com.example.demo.service;


import com.example.demo.entity.*;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CartItemService {

    List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);

    CartItem updateCartItem(CartItem cartItem);

    CartItem addBookToCartItem(Test test, User user, int qty);

//    CartItem findById(Long id);

    void removeCartItem(CartItem cartItem);

    CartItem save(CartItem cartItem);

    List<CartItem> findByOrder(Order order);
}
