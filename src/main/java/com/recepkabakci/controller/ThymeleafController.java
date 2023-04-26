package com.recepkabakci.controller;

import com.recepkabakci.dto.ProductDto;
import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ThymeleafController {

    //optional path route.: @GetMapping({"/","index"})
    //http://localhost:8080
    //http://localhost:8080/index
    @GetMapping({"/","index"})
    //@ResponseBody  // return response which is not html(thymelaf)
    public String index() {
        return "index";
    }

    //http://localhost:8080/thymeleaf1
    @GetMapping("/thymeleaf1")
    //@ResponseBody  // return response which is not html(thymelaf)
    public String thymeleaf1() {
        return "thymeleaf1";
    }

    //http://localhost:8080/thymeleaf2
    @GetMapping("/thymeleaf2")
    public String thymeleaf2(Model model) {
        model.addAttribute("key_model", "I am Model.");
        model.addAttribute("key_model1", "I am Model 1 and ready.");
        return "thymeleaf2";
    }

    //http://localhost:8080/thymeleaf3
    @GetMapping("/thymeleaf3")
    public String thymeleaf3(Model model) {
        model.addAttribute("key_model", "I am Model.");
        model.addAttribute("key_model1", "I am Model 1 and ready.");
        return "thymeleaf_file/thymeleaf3";
    }

    //http://localhost:8080/thymeleaf4
    @GetMapping("/thymeleaf4")
    public String thymeleaf4(Model model) {
        model.addAttribute("key_model", "I am Model -Thymeleaf4.");
        return "thymeleaf4";
    }

    //http://localhost:8080/thymeleaf5
    @GetMapping("/thymeleaf5")
    public String thymeleafObject(Model model) {
        model.addAttribute("key_model", "I am Model -Thymeleaf4.");
        ProductDto productDto = ProductDto
                .builder()
                .productId(0L)
                .productName("Robot")
                .productPrice(250.4)
                .build();
        model.addAttribute("key_model2", productDto);
        return "thymeleaf5";
    }

    //http://localhost:8080/thymeleaf6
    @GetMapping("/thymeleaf6")
    public String thymeleafObjectList(Model model) {
        model.addAttribute("key_model", "I am Model -Thymeleaf4.");
        List<ProductDto> productDtoList = new ArrayList<>();
        productDtoList.add( ProductDto.builder().productId(0L).productName("Robot").productPrice(250.4).build());
        productDtoList.add( ProductDto.builder().productId(1L).productName("Robot1").productPrice(265.0).build());
        productDtoList.add( ProductDto.builder().productId(2L).productName("Robot2").productPrice(665.9).build());
        model.addAttribute("productList", productDtoList);
        return "thymeleaf6";
    }
    //http://localhost:8080/thymeleaf7
    //http://localhost:8080/thymeleaf7/1
    @GetMapping({"thymeleaf7","/thymeleaf7/{id}"})
    public String thymeleafObjectPathVariable(Model model, @PathVariable(name = "id",required = false)Long id) {
        if(id!=null) {
            model.addAttribute("key_model", "called id : " + id);
        }else{
            model.addAttribute("key_model", "Can not find the id.");
        }
        return "thymeleaf7";
    }


}
