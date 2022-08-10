package com.flatiron.spring.FlatironSpring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private JokeService jokeService;

    public HelloController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(name = "targetName", defaultValue = "Stephanie") String name) {
        String greeting = "Hello " + name;
        greeting += "<br/>";
        greeting += "Dad joke of the moment: " + jokeService.getDadJoke();
        return greeting;
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(name= "targetName", defaultValue = "Stephanie") String name) {
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
