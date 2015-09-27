package com.liurong.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/")
public class StudentController {
    @Autowired
    private StudentDao studentDao;

    @RequestMapping(method = RequestMethod.GET)
    public String list(Model model){
        List<Student> students = studentDao.findAll();
        model.addAttribute("students", students);
        return "index";
    }
}
