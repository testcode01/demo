package com.bek.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

    @RequestMapping("/")
    public String home(){
        return "index";
    }

    @RequestMapping
    public String info(){
        return "home";
    }
}
