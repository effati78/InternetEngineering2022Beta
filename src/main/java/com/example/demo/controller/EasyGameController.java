package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EasyGameController {

    @GetMapping("/easyGame")
    public String easyGame() {
        String page = "<!DOCTYPE HTML>\n" +
                "<html>\n" +
                "    <head>\n" +
                "        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Raleway:400,400i,700\">"
                +
                "        <link rel=\"stylesheet\" href=\"./style.css\">" +
                "        <title>Your first Spring application</title>\n" +
                "        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n" +
                "    </head>\n" +
                "    <body>\n" +
                "       <h1>12, 13, 14, 15, _ ? </h1>" +
                "       <form class=\"form\" action=\"http://127.0.0.1:8080/checkEasyGame\" method=\"GET\">" +
                "           <p>What is the next number?</p>" +
                "           <label class=\"number\"><input type=\"number\" name=\"number\" autocomplete=\"off\" placeholder=\"Number\"></label>" +
                "           <input type=\"submit\" value=\"Submit\">" +
                "       </form>" +
                "    </body>\n" +
                "</html>";
        return page;
    }

    @GetMapping("/checkEasyGame")
    public String checkEasyGame(@RequestParam(value = "number", defaultValue = "default") String number1) {
        String rst = "";
        if (number1.equals("16"))
            rst = "Correct :)";
        else
            rst = "Incorrect :(";
        String page = "<!DOCTYPE HTML>\n" +
                "<html>\n" +
                "    <head>\n" +
                "        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Raleway:400,400i,700\">"
                +
                "        <link rel=\"stylesheet\" href=\"./style.css\">" +
                "        <title>Your first Spring application</title>\n" +
                "        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n" +
                "    </head>\n" +
                "    <body>\n" +
                "     <h2> " + rst + "</h2>" +
                "    </body>\n" +
                "</html>";
        return page;
    }

}
