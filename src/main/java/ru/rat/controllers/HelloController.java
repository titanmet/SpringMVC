package ru.rat.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;


@Controller
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "index.jsp";
    }

    @GetMapping(value = "/bye")
    public String bye() {
        return "bye.jsp";
    }

    @GetMapping(value = "/pass-data")
    public String passDataFromUser() {
        return "pass-data.jsp";
    }

    @PostMapping(value = "/pass-data")
    public ModelAndView passDataFromUser(@ModelAttribute("user") User user, ModelAndView modelAndView){
        System.out.println(user);
        modelAndView.setViewName("forward:summary.jsp");
        modelAndView.addObject("user",user);
        return modelAndView;
    }
}
