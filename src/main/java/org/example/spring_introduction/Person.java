package org.example.spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*@Component("personBean")*/
public class Person {


    private Pet pet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
/*    public Person() {
    }*/
/*
    @Autowired

    public Person(@Qualifier("catBean") Pet pet) {
        System.out.println("Constructor is created");
        this.pet = pet;
    }
*/
        public Person(Pet pet) {
            System.out.println("Constructor is created");
            this.pet = pet;
        }


    public void callYourPet(){
        System.out.println("Hi,my pet!)");
        pet.say();
    }
/*@Autowired

    public void setPet(Pet pet) {
        System.out.println("Set pet");
        this.pet = pet;
    }*/
}
