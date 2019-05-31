package com.example.demo.controller;

import com.example.demo.form.PracticeForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "user")
public class AiriController {
    @RequestMapping(value = "register")
    public String Airi(){
        return "userRegisterForm";
    }

    @RequestMapping(value= "item/register")
    public String hello(Model model){
        PracticeForm practiceForm = new PracticeForm();
        practiceForm.setHobby("ピアノ");
        practiceForm.setName("Airi");
        model.addAttribute(practiceForm);
        model.addAttribute("hello","hi");
        return "itemRegisterForm";
    }
}
