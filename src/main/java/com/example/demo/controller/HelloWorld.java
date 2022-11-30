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
                "        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Raleway:400,400i,700\">"
                +
                "        <link rel=\"stylesheet\" href=\"./style.css\">" +
                "        <title>My web service</title>\n" +
                "        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n" +
                "    </head>\n" +
                "    <body>\n" +
                "       <div>"+
                "           <h1>" + number1 + " + " + number2 + " = " + (number1 + number2) + "</h1>" +
                "       </div>"+
                "    </body>\n" +
                "</html>";
        return page;
    }

}
