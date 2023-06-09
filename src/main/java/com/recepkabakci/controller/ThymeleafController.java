package com.recepkabakci.controller;

import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ThymeleafController {

    //http://localhost:8080/thymeleaf1
    @GetMapping("/thymeleaf1")
    //@ResponseBody  // return response which is not html(thymelaf)
    public String thymeleaf1(){
        return "thymeleaf1";
    }
    //http://localhost:8080/thymeleaf2
    @GetMapping("/thymeleaf2")
    public String thymeleaf2(Model model){
        model.addAttribute("key_model","I am Model.");
        model.addAttribute("key_model1","I am Model 1 and ready.");
        return "thymeleaf2";
    }

    //http://localhost:8080/thymeleaf3
    @GetMapping("/thymeleaf3")
    public String thymeleaf3(Model model){
        model.addAttribute("key_model","I am Model.");
        model.addAttribute("key_model1","I am Model 1 and ready.");
        return "thymeleaf_file/thymeleaf3";
    }


}
