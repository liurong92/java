package com.liurong.controller;

import com.liurong.model.Product;
import com.liurong.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/product")
    public String list(Model model){
        List<Product> products = productService.getProducts();
        model.addAttribute("products", products);
        return "product";
    }
}
