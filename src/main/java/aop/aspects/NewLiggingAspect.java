package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLiggingAspect {
    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice: ПЫТАЮТСЯ ВЕРНУТЬ");
        Object targetMethodResult = null;
        try {
             targetMethodResult =  proceedingJoinPoint.proceed();
        }
        catch (ArithmeticException e){

            System.out.println("Логируем ошибку: "+ e);
            throw e;
        }




        System.out.println("aroundReturnBookLoggingAdvice: ВЕРНУЛИ ");

        return targetMethodResult;
    }
}
