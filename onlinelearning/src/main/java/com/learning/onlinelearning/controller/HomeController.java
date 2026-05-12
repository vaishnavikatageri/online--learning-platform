package com.learning.onlinelearning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";
    }
    @GetMapping("/courses")
    public String courses() {

        return "courses";
    }
    
    @GetMapping("/course-details")
    public String courseDetails() {

        return "course-details";
    }
    
    @GetMapping("/mycourses")
    public String myCourses() {                                                        

        return "mycourses";
        
    }
    @GetMapping("/react-details")
    public String reactDetails() {

        return "react-details";
    }
    @GetMapping("/login")
    public String login() {
        return "login";
    }
    @GetMapping("/signup")
    public String signup() {
        return "signup";
    }
}