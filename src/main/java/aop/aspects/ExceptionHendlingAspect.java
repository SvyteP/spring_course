package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(30)
public class ExceptionHendlingAspect {
    @Before("aop.aspects.MyPointCuts.allAddMethods()")
    public void beforeAddExceptionHandlingAdvice(){
        System.out.println("beforeAddExceptionHandlingAdvice: Ловим исключение при попытке получить Книгу/Журнал");
        System.out.println("-------------------------------------------------------");
    }
}
