package com.example.framework.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 配置切面类
 */
@Aspect
@Component
public class MyAspect {

    // 前置通知
    @Before(value = "execution(public * com.example.framework.aop.CustomerServiceImpl.*(..))")
    public void before() {
        System.out.println("前置通知");
    }

    // 最终通知
    @After(value = "execution(public * com.example.framework.aop.CustomerServiceImpl.*(..))")
    public void after() {
        System.out.println("最终通知");
    }

    // 后置通知
    @AfterReturning(value = "execution(public * com.example.framework.aop.CustomerServiceImpl.*(..))")
    public void afterReturning() {
        System.out.println("后置通知");
    }

    // 异常通知
    @AfterThrowing(value = "execution(public * com.example.framework.aop.CustomerServiceImpl.*(..))")
    public void afterThrowing() {
        System.out.println("异常通知");
    }

    // 环绕通知
    @Around(value = "execution(public * com.example.framework.aop.CustomerServiceImpl.*(..))")
    public void around(ProceedingJoinPoint pjp) {
        System.out.println("前置通知--前面代码");
        //执行目标对象方法
        try {
            pjp.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        System.out.println("前置通知--后面代码");
    }

}