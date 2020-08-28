package com.zun.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class UserAccessAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Before("execution(* com.zun.springaop.data.*.*(..))")
    public void before(JoinPoint joinPoint) {
        logger.info("Check for user access");
        logger.info("Allow execution for {}", joinPoint);
    }

    @AfterReturning(
            value = "execution(* com.zun.springaop.business.*.*(..))",
            returning = "res")
    public void afterReturning(JoinPoint joinPoint, Object res) {
        logger.info("{} returned with value {}", joinPoint, res);
    }

    @AfterThrowing(
            value = "execution(* com.zun.springaop.business.*.*(..))",
            throwing = "exception")
    public void afterThrowing(JoinPoint joinPoint, Object exception) {
        logger.info("{} throws exception {}", joinPoint, exception);
    }

    @After("execution(* com.zun.springaop.business.*.*(..))")
    public void after(JoinPoint joinPoint) {
        logger.info("after execution of {}", joinPoint);
    }

}
