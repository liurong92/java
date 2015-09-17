package com.liurong.controller;

import com.liurong.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.sql.ResultSet;

@Controller
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/order", method = RequestMethod.GET)
    public void order(Model model){
        ResultSet order = null;
        try {
            order = orderService.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        model.addAttribute("order", order);
    }
}
