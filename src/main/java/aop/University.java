package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents(){
        Student st1 = new Student("Abramov Maxim",2,4.5);
        Student st2 = new Student("Ivanov Ivan",3,3.5);
        Student st3 = new Student("Petrov Petya",4,5);

        students.add(st1);
        students.add(st2);
        students.add(st3);

    }

    public List<Student> getStudents() {
        System.out.println("Начало работы метода GetStudents");
        /*System.out.println(students.get(3));*/
        System.out.println("Information from method getStudents:");
        System.out.println(students);
        return students;
    }
}
