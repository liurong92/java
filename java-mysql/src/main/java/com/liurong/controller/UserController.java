package com.liurong.controller;

import com.liurong.model.Product;
import com.liurong.model.User;
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

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/userProfile", method = RequestMethod.GET)
    public String login(Model model,@RequestParam String userName, String password){
        User user = userService.login(userName);
        if(user.getPassword().equals(password)) {
            List<Product> products = productService.getProducts();
            model.addAttribute("products", products);
            model.addAttribute("user",user);
            return "userProfile";
        }
        return "index";
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public ModelAndView addUser(@RequestParam String userName, String password, String trueName,
                          int userAge, String email, String address) {
        System.out.println(userName);
        System.out.println(email);

        userService.addUser(new User(userName, password, trueName, userAge, email, address));
        return new ModelAndView("redirect:/register");
    }

    @RequestMapping(value = "/updateUser", method = RequestMethod.POST)
    public ModelAndView updateUser(Model model, @RequestParam int userId, String userName, String password,
                                   String trueName, int userAge, String email, String address){
        userService.updateUser(new User(userId, userName, password, trueName, userAge, email, address));
        model.addAttribute("products", productService.getProducts());
        model.addAttribute("user", userService.findUserById(userId));
        return new ModelAndView("userProfile");
    }
}
