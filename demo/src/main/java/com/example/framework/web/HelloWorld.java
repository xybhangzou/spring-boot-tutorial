package com.example.framework.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @RequestMapping(value="/hello")
    public String hello(){
        String sentence = "Hello worrrrld !";
        System.out.println("HelloWorld.hello");
        return  sentence;
    }
}
