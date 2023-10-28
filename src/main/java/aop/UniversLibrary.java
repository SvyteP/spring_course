package aop;

import org.springframework.stereotype.Component;

@Component
public class UniversLibrary extends AbstractLibrary{
    public void getBook(){
        System.out.println("We're taking book UniversLibrary");
        System.out.println("-------------------------------------------------------");
    }
    protected void returnBook(){
        System.out.println("We're return book UniversLibrary");
        System.out.println("-------------------------------------------------------");
    }
    public void getMagazine(){
        System.out.println("We're taking magazine UniversLibrary");
        System.out.println("-------------------------------------------------------");
    }
    public void returnMagazine(){
        System.out.println("We're return magazine UniversLibrary");
        System.out.println("-------------------------------------------------------");

    }

    public void addBook(String person_name , Book book){
        System.out.println("We're add Book UniversLibrary");
        System.out.println("-------------------------------------------------------");
    }
    public void addMagazine(){
        System.out.println("We're add magazine UniversLibrary");
        System.out.println("-------------------------------------------------------");
    }

}
