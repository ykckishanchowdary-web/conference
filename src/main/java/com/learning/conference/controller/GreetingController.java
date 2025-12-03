package com.learning.conference.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class GreetingController {

    @GetMapping("greeting")
    public String greeting(Map<String,Object> model){
        model.put("message","Hello Kishan");

        //look for the greeting jsp and replace that message inthe Jsp file
        return "greeting";
    }

    @GetMapping("thyme")
    public String thyme(Map<String,Object> model){
        model.put("message","hello Thymeleaf");
        return "thyme";
    }
}
