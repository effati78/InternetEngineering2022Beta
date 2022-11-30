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
                "        <title>Your first Spring application</title>\n" +
                "        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n" +
                "    </head>\n" +
                "    <body>\n" +
                "     <h1>" + 12 + " " + 13 + " " + 14 + " " + 15 + " " + "? </h1>" +
                " <form action=\"http://127.0.0.1:8080/checkeasygame\" method=\"GET\" id=\"nameForm\">\n" +
                "            <div>\n" +
                "           <p>\n" +
                "               <label for=\"nameField\">What is the next number?</label>\n" +
                "                <input name=\"number\" id=\"nameField\">\n" +
                "           </p>\n" +
                "                <button>Send Number!</button>\n" +
                "            </div>\n" +
                "        </form>" +
                "    </body>\n" +
                "</html>";
        return page;
    }

    @GetMapping("/checkEasyGame")
    public String checkEasyGame(@RequestParam(value = "number", defaultValue = "default") String number1) {
        String rst = "";
        if (number1.equals("16"))
            rst = "Correct";
        else
            rst = "Incorrect";
        String page = "<!DOCTYPE HTML>\n" +
                "<html>\n" +
                "    <head>\n" +
                "        <title>Your first Spring application</title>\n" +
                "        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n" +
                "    </head>\n" +
                "    <body>\n" +
                "     <h1> " + rst + "</h1>" +
                "    </body>\n" +
                "</html>";
        return page;
    }

}
