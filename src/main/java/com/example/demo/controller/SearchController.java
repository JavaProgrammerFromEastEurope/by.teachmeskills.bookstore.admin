package com.example.demo.controller;


import com.example.demo.entity.Test;
import com.example.demo.entity.User;
import com.example.demo.service.TestService;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;
import java.util.List;

@Controller
public class SearchController {

    private final UserService userService;

    private final TestService testService;

    public SearchController(UserService userService, TestService testService) {
        this.userService = userService;
        this.testService = testService;
    }

    @RequestMapping("/searchByCategory")
    public String searchByCategory(
            @RequestParam("category") String category,
            Model model, Principal principal) {

        if (principal != null) {
            String username = principal.getName();
            User user = userService.findByUsername(username);
            model.addAttribute("user", user);
        }

        String classActiveCategory = "active" + category;
        classActiveCategory = classActiveCategory.replaceAll("\\s+", "");
        classActiveCategory = classActiveCategory.replaceAll("&", "");
        model.addAttribute(classActiveCategory, true);

        List<Test> testList = testService.findByDelimiter(category);

        if (testList.isEmpty()) {
            model.addAttribute("emptyList", true);
            return "bookshelf";
        }
        model.addAttribute("bookList", testList);

        return "bookshelf";
    }

    @RequestMapping("/searchBook")
    public String searchBook(
            @ModelAttribute("keyword") String keyword,
            Principal principal, Model model) {

        if (principal != null) {
            String username = principal.getName();
            User user = userService.findByUsername(username);
            model.addAttribute("user", user);
        }

        List<Test> testList = testService.blurrySearch(keyword);
        if (testList.isEmpty()) {
            model.addAttribute("emptyList", true);
            return "bookshelf";
        }
        model.addAttribute("bookList", testList);

        return "bookshelf";
    }
}
