package com.flatiron.spring.FlatironSpring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(String name) {
//        return "Hello World";
        return String.format("Hello %s", name);
    }

    @GetMapping("/reverse")
    public String reverse(String str) {
        StringBuffer sbr = new StringBuffer(str);
        sbr.reverse();
        return sbr.toString();
    }
}
