package com.securityoauth2.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

    @GetMapping("/home")
    public String home() {
        return "this is home method";
    }

    /*
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
    */
}