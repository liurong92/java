package com.liurong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UtilController {

    @RequestMapping(value = "/register")
    public String register(Model model){
        return "register";
    }

    @RequestMapping(value = "/")
    public String index(Model model){
        return "redirect:/product";
    }

}
