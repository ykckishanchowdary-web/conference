package com.learning.conference.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class registrationController {

    //ModelAttribute to attach the model object

    @GetMapping("registration")
    public String registration(Map<String,Object> model){
        // to not oversubmit the same information , use the redirect
        return "redirect:registration";
    }
}
