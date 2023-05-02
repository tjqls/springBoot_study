package com.example.sbb;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @RequestMapping("/name")
    @ResponseBody
    public String name(){
    return "서빈";
}

    @RequestMapping("/age")
    @ResponseBody
    public int age(){
        return 26;
    }

    @GetMapping("/height")
    @ResponseBody
    public int height(){
        return 170;
    }

}
