package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.annotation.RequestScope;

@Controller
public class PracticeController {

    @RequestMapping(value = "item/register")
    public String hello(){
        return "itemRegisterForm";
    }
}
