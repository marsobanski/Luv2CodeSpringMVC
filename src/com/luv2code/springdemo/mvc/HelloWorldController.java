package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String procesForm() {
        return "hello-world";
    }

    @RequestMapping("/processFormV2")
    public String letsShoutDude(HttpServletRequest request, Model model) {
        String dudeName = request.getParameter("dudeName");
        model.addAttribute("dudeName", "Yo! " + dudeName.toUpperCase());
        return "hello-world";
    }

    @RequestMapping("/processFormV3")
    public String processFormV3(
            @RequestParam("personName") String dudeName,
            Model model) {
        model.addAttribute("personName", "Hello! " + dudeName.toUpperCase());
        return "hello-world";
    }
}
