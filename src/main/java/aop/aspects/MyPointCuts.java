package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyPointCuts {
    @Pointcut("execution(* abc*(..))")  // выражение Pointcut
    public void allAddMethods(){}

}
