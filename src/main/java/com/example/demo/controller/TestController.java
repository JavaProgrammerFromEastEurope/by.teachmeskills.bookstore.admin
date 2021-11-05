package com.example.demo.controller;

import com.example.demo.entity.Test;
import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping(value = "/test")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addTest(Model model) {
        Test test = new Test();
        model.addAttribute("test", test);
        return "add-test";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addBookPost(
            @ModelAttribute("test") Test test,
            HttpServletRequest request) {
            testService.save(test);

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
        return "redirect:testList";
    }
    @RequestMapping(value = "/testList", method = RequestMethod.GET)
    public String testList(Model model){
        List<Test> testList = testService.findAll();
        model.addAttribute("testList", testList);
        return "testList";
    }
}