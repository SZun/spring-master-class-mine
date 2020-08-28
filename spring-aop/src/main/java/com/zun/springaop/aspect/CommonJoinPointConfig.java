package com.zun.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {

    @Pointcut("execution(* com.zun.springaop.data.*.*(..))")
    public void dataLayerExecution(){}

    @Pointcut("execution(* com.zun.springaop.business.*.*(..))")
    public void businessLayerExecution(){}

}
