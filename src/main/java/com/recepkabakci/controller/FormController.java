package com.recepkabakci.controller;

import com.recepkabakci.dto.EmployeeDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.sql.SQLOutput;

@Controller
@Log4j2
public class FormController {
    //http://localhost:8080/form
    @GetMapping("/form")
    public String getForm(Model model){
        model.addAttribute("cv_employee",new EmployeeDto());
        return "formvalidation/formvalidation";
    }

    //http://localhost:8080/form
    @PostMapping("/form")
    public String postForm(@Valid @ModelAttribute("cv_employee") EmployeeDto employeeDto , BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            log.error("There is an error....");
            System.err.println("There is an error....");
            return "formvalidation/formvalidation";
        }
        log.info("Success !" +employeeDto);
        return "formvalidation/success";
    }
}
