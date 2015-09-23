package com.liurong.controller;

import com.liurong.model.Order;
import com.liurong.model.User;
import com.liurong.service.OrderService;
import com.liurong.service.ProductService;
import com.liurong.service.UserService;
import org.apache.xpath.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

@Controller
public class OrderController {
    @Autowired
    private OrderService orderService;

    @Autowired
    private ProductService productService;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/addOrder", method = RequestMethod.POST)
    public ModelAndView addOrder(Model model, @RequestParam int userId, String productName, String productPrice) throws UnsupportedEncodingException {
        orderService.addOrder(new Order(new String(productName.getBytes("ISO-8859-1"), "utf-8"), productPrice, userId));
        model.addAttribute("products", productService.getProducts());
        model.addAttribute("user", userService.findUserById(userId));
        return new ModelAndView("userProfile");
    }

    @RequestMapping(value = "/userOrder", method = RequestMethod.GET)
    public ModelAndView showOrderByUserId(Model model, @RequestParam int userId) {
        List<Order> orders= orderService.findOrderByUserId(userId);
        model.addAttribute("orders", orders);
        model.addAttribute("userId", userId);
        return new ModelAndView("userOrder");
    }

    @RequestMapping(value = "/deleteOrder", method = RequestMethod.GET)
    public ModelAndView deleteOrderByOrderId(Model model, @RequestParam int orderId, int userId){
        orderService.deleteOrder(orderId);
        List<Order> orders= orderService.findOrderByUserId(userId);
        model.addAttribute("orders", orders);
        model.addAttribute("userId", userId);
        return new ModelAndView("userOrder");
    }

    @RequestMapping(value = "/returnProfile")
    public ModelAndView returnProfile(Model model, @RequestParam int userId){
        User user = userService.findUserById(userId);
        model.addAttribute("userName", user.getUserName());
        model.addAttribute("password", user.getPassword());
        return new ModelAndView("redirect:userProfile");
    }
}
