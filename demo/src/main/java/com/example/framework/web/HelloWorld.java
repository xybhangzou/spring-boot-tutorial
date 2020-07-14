//package com.example.framework.web;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class HelloWorld {
//
//    @Value("${user.nickname}")
//    private String nickname;
//
//    @Value("${user.age}")
//    private Integer age;
//
//
//
//    @RequestMapping(value="/hello")
//    public String hello() {
//        String sentence = "Hello world !";
//        System.out.println("HelloWorld.hello");
//        return  sentence;
//    }
//
//    @RequestMapping(value="/getException1")
//    public void getException()  {
//            int a = 34;
//            int c = a/0;
//    }
//
//    @RequestMapping(value="/getPropertityValue")
//    public String getPropertityValue(){
//        return "my name is :"+nickname+",age is "+ age;
//    }
//
//    @RequestMapping("/hello1")
//    public String hello1(){
//        //模拟java.lang.ArithmeticException异常
//        int i = 10/0;
//        return "欢迎来到一点教程网";
//    }
//
//    @RequestMapping("/hello2")
//    public String hello2(){
//        //模拟java.lang.NullPointerException异常
//        String name=null;
//        name.trim();
//        return "欢迎来到一点教程网";
//    }
//}
