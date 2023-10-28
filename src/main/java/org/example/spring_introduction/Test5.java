package org.example.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext
                        ("applicationContext4.xml");
        Dog muDog =context.getBean("myPet",Dog.class);
        muDog.say();
        Dog yourDog =context.getBean("myPet",Dog.class);
        yourDog.say();

        context.close();
    }
}
