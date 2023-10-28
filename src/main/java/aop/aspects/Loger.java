package aop.aspects;

import aop.Book;
import jdk.jshell.MethodSnippet;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class Loger {


                    // Advice's
    @Before("aop.aspects.MyPointCuts.allAddMethods()")//pointcut- когда должен выполниться сквозной код
    public void beforeAddLogerAdvice(JoinPoint joinPoint){

       MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = "+methodSignature);
        System.out.println("methodSignature.getMethod() = "+methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() = "+methodSignature.getReturnType());
        System.out.println("methodSignature.getName() = "+methodSignature.getName());

        if(methodSignature.getName().equals("addBook")){
            Object [] argum = joinPoint.getArgs();
            for (Object obj : argum){
                if (obj instanceof Book){
                    Book myBook = (Book) obj;
                    System.out.println("Info book: "+ myBook.getName()+" | " +myBook.getAuthor() + " | " + myBook.getYearOfPublic());
                }
                else if (obj instanceof String){
                    System.out.println("Книгу добавил: " + obj);
                }
            }
        }

        System.out.println("beforeAddBookAdvice: Логирование попытки получить книгу/журнал");
        System.out.println("-------------------------------------------------------");
    }


/*    @Pointcut("execution(* aop.UniversLibrary.*(..))")
    private void allMethodsFromUniversLibrary(){}

    @Pointcut("execution(public void aop.UniversLibrary.returnMagazine())")
    private  void returnMagazinFromUniversLibrary(){}

    @Pointcut("allMethodsFromUniversLibrary() && !returnMagazinFromUniversLibrary()")
    private  void allMethodsRetutnMagazineFromUniversLibrary(){}



    @Before("allMethodsRetutnMagazineFromUniversLibrary()")
    public void beforeAllMethodsExceptRetutnMagazineAdvice(){
        System.out.println("beforeAllMethodsExceptRetutnMagazineAdvice: Log #10");

    }*/


    /*@Pointcut("execution(* aop.UniversLibrary.get*())")
    private void allGetMethodsFromUniversLibrary(){

    }
    @Pointcut("execution(* aop.UniversLibrary.return*())")
    private void allReturnMethodsFromUniversLibrary(){

    }


    @Pointcut("allGetMethodsFromUniversLibrary() || allReturnMethodsFromUniversLibrary()")
    private void allGetAndReturnMethodsFromUniversLibrary(){

    }

    @Before("allGetMethodsFromUniversLibrary()")
    public void beforeGetLoggingAdvice(){
        System.out.println("beforeGetLoggingAdvice: writing Log #1");
    }

    @Before("allReturnMethodsFromUniversLibrary()")
    public void beforeReturnLoggingAdvice(){
        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
    }



    @Before("allGetAndReturnMethodsFromUniversLibrary()")
    public void beforeGetAndReturnLoggingAdvice(){
        System.out.println("beforeGetAndReturnLoggingAdvice: writing Log #3");
    }
*/





}
