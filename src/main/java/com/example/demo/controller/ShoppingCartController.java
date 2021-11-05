package com.example.demo.controller;

import com.example.demo.entity.CartItem;
import com.example.demo.entity.ShoppingCart;
import com.example.demo.entity.User;
import com.example.demo.service.TestService;
import com.example.demo.service.CartItemService;
import com.example.demo.service.ShoppingCartService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;
import java.util.List;

@Controller
@RequestMapping("/shoppingCart")
public class ShoppingCartController {

    @Autowired
    private UserService userService;

    @Autowired
    private CartItemService cartItemService;

    @Autowired
    private ShoppingCartService shoppingCartService;

    @Autowired
    private TestService testService;

    @RequestMapping("/cart")
    public String shoppingCart(Model model, Principal principal) {
        User user = userService.findByUsername(principal.getName());
        ShoppingCart shoppingCart = user.getShoppingCart();

        List<CartItem> cartItemList = cartItemService.findByShoppingCart(shoppingCart);

        shoppingCartService.updateShoppingCart(shoppingCart);
        model.addAttribute("cartItemList", cartItemList);
        model.addAttribute("shoppingCart", shoppingCart);

        return "shoppingCart";
    }

//    @RequestMapping(value = "/addItem", method = RequestMethod.GET)
//    public String addItem(
//            @ModelAttribute("book") Book book,
//            @ModelAttribute("qty") String qty,
//            Model model, Principal principal) {
//
//        User user = userService.findByUsername(principal.getName());
//        book = bookService.findOne(book.getId());
//
//        if (Integer.parseInt(qty) > book.getInStockNumber()) {
//            model.addAttribute("notEnoughStock", true);
//            return "forward:/bookDetail?id=" + book.getId();
//        }
//        CartItem cartItem = cartItemService.addBookToCartItem(book, user, Integer.parseInt(qty));
//            model.addAttribute("addBookSuccess", true);
//
//        return "forward:/bookDetail?id=" + book.getId();
//    }
}