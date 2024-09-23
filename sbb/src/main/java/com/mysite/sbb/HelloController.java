package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("/hello")
    @ResponseBody
//    @ResponseBody : HTML의 있는 <body>안에 넣는 개념
    public String hello() {
        return "<h1>Hello World~!!♬</h1>";
    }
}