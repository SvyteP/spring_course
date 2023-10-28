package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        UniversLibrary universLibrary = context.getBean("universLibrary", UniversLibrary.class);
        Book book =context.getBean("book",Book.class);

        universLibrary.addBook("Abr",book);
        universLibrary.getBook();

        universLibrary.addMagazine();
        universLibrary.getMagazine();
    /*    universLibrary.returnMagazine();
        universLibrary.addBook();*/


        //universLibrary.returnBook();


        //ShoolLibrary shoolLibrary = context.getBean("shoolLibrary", ShoolLibrary.class);
        //shoolLibrary.getBook();



        context.close();
    }
}
