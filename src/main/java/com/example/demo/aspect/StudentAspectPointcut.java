package com.example.demo.aspect;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class StudentAspectPointcut {
    @Before("getTaskPointcut()")
    public void loggingAdvice() {
        System.out.println("Executing loggingAdvice on getTask()");
    }

    @Before("getTaskPointcut()")
    public void secondAdvice() {
        System.out.println("Executing secondAdvice on getTask()");
    }

    @Pointcut("execution(public String getTask())")
    public void getTaskPointcut() {

    }
}
