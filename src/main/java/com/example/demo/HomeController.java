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
    @RequestMapping("/blog3")
    public String fish4(){
        return "blog3";
    }
    @RequestMapping("/blog4")
    public String fish5(){
        return "blog4";
    }
    @RequestMapping("/blog5")
    public String fish6(){
        return "blog5";
    }
    @RequestMapping("/blog6")
    public String fish7(){
        return "blog6";
    }
    @RequestMapping("/blog7")
    public String fish8(){
        return "blog7";
    }
    @RequestMapping("/blog8")
    public String fish9(){
        return "blog8";
    }
    @RequestMapping("/blog10")
    public String fish11(){
        return "blog10";
    }
    @RequestMapping("/blog9")
    public String fish10(){
        return "blog9";
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
