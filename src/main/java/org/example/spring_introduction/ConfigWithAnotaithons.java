package org.example.spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnotaithons {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext
                        ("applicationContext3.xml");


        Person person = context.getBean("personBean",Person.class);
        person.callYourPet();
     /*   System.out.println(person.getSurname());
        System.out.println( person.getAge());*/

/*       Cat cat = context.getBean("cat",Cat.class);
        cat.say();*/
        context.close();
    }
}
