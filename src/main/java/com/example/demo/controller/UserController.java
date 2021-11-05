package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addUser(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "add-user";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addUserPost(
            @ModelAttribute("user") User user,
            HttpServletRequest request) {
            userService.save(user);

//        MultipartFile bookImage = test.getBookImage();

//        try {
//            byte[] bytes = bookImage.getBytes();
//            String name = test.getId() + ".png";
//            BufferedOutputStream stream = new BufferedOutputStream(
//                    new FileOutputStream(new File("src/main/resources/static/image/test/" + name)));
//            stream.write(bytes);
//            stream.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        return "redirect:userList";
    }
    @RequestMapping(value = "/userList", method = RequestMethod.GET)
    public String userList(Model model){
        List<User> userList = userService.findAll();
        model.addAttribute("userList", userList);
        return "userList";
    }
}