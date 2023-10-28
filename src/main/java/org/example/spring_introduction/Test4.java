package org.example.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext
                        ("applicationContext4.xml");
/*        Dog myDog = context.getBean("myPet",Dog.class);

        Dog yourDog = context.getBean("myPet",Dog.class);

        myDog.setName("пончик");
        yourDog.setName("булка");
        System.out.println(myDog.getName());
        System.out.println(yourDog.getName());*/
/*        System.out.println((myDog == yourDog));
        System.out.println(myDog);
        System.out.println(yourDog);*/
    }
}
