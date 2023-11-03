package aop;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UnivestityLoggAspect {
    /*@Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice(){
        System.out.println("beforeGetStudentsLoggingAdvice: Логируем получение списка студентов ДО");
    }
    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
    public void afterReturningGetStudentsLoggingAdvice(List <Student> students){

        // изменение данных таргета , до их возвращения (нельзя злоупотреблять!!!)
        Student firstStudent = students.get(0);
        String nameSurname = firstStudent.getNameSurname();
        nameSurname = "Mr." + nameSurname;
        firstStudent.setNameSurname(nameSurname);

        double avgGrade = firstStudent.getAvgGrade();
        avgGrade = avgGrade -1;
        firstStudent.setAvgGrade(avgGrade);




        System.out.println("afterReturningGetStudentsLoggingAdvice: Логируем получение списка студентов ПОСЛЕ");

    }

    @AfterThrowing(pointcut = "execution(* getStudents())",throwing = "exception")
    public void afterThrowingGetStudentsLogginAdvice (Throwable exception) {
        System.out.println("afterThrowingGetStudentsLogginAdvice: логируем выброс исключения " + exception);

    }*/

    @After("execution(* getStudents())")
    public void afterGetStudentsLogginAdvice()
    {
        System.out.println("afterGetStudentsLogginAdvice: логируем нормальное олкончание работы метода или исключение");
    }
}
