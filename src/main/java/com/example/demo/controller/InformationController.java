package com.example.demo.controller;

import com.example.demo.entity.Information;
import com.example.demo.entity.Test;
import com.example.demo.service.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping(value = "/info")
public class InformationController {

    @Autowired
    private InformationService informationService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addInfo(Model model) {
        Information information = new Information();
        model.addAttribute("info", information);
        return "add-info";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addInfoPost(
            @ModelAttribute("info") Information information,
            HttpServletRequest request) {
            informationService.save(information);

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
        return "redirect:infoList";
    }
    @RequestMapping(value = "/infoList", method = RequestMethod.GET)
    public String infoList(Model model){
        List<Information> infoList = informationService.findAll();
        model.addAttribute("infoList", infoList);
        return "infoList";
    }
}