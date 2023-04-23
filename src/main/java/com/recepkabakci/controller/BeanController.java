package com.recepkabakci.controller;

import com.recepkabakci.bean.BeanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class BeanController {
    @Autowired
    BeanService beanService;

    //http://localhost:8080/bean/beanDto
    @GetMapping("/bean/beanDto")
    @ResponseBody // show on the screen without html.
    public String getBeanDto(){
        return beanService.beanDto()+".";
    }
}
