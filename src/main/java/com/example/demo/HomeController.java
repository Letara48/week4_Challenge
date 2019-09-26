package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
    @RequestMapping("/blog1")
    public String fish(){
        return "blog1";
    }
    @RequestMapping("/blog2")
    public String other(){
        return "blog2";
    }
    @RequestMapping("/about")
    public String dessert(){
        return "about";
    }
    @RequestMapping("/boot")
    public String java(){
        return "boot";
    }
}
