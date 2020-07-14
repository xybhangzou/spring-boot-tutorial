//package com.example.framework.exception;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.HandlerExceptionResolver;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
///**
// * 定义全局异常，根据异常类型跳转到对应的异常页面。
// */
//@Configuration
//public class MyHandlerExceptionResolver implements HandlerExceptionResolver {
//
//    @Override
//    public ModelAndView resolveException(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2,
//                                         Exception e) {
//        ModelAndView mv = new ModelAndView();
//        //判断不同异常类型，做不同处理
//        if(e instanceof ArithmeticException){
//            mv.setViewName("ArithmeticException");
//        }
//        if(e instanceof NullPointerException){
//            mv.setViewName("NullPointerException");
//        }
//        mv.addObject("error", e.toString());
//        return mv;
//    }
//
//}