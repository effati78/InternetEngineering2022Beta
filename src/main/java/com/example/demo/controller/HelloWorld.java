package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!!!";
    }

    @GetMapping("/sum")
    public String sum(@RequestParam int number1, @RequestParam int number2) {
        String page = "<!DOCTYPE HTML>\n" +
                "<html>\n" +
                "    <head>\n" +
                "        <title>My web service</title>\n" +
                "        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n" +
                "    </head>\n" +
                "    <body>\n" +
                "     <p>Number 1 :<i>" + number1 + "</i></p>" +
                "     <p>Number 2 :<i>" + number2 + "</i></p>" +
                "     <h1>SUM is :<i>" + (number1 + number2) + "</i></h1>" +
                "    </body>\n" +
                "</html>";
        return page;
    }

}
