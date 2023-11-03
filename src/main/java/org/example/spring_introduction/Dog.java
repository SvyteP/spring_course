package org.example.spring_introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;



/*@Component("dogBean")*/
@Scope("singleton")
public class Dog implements Pet {
  /*     private String name;

 public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }*/
/*    @PostConstruct
    protected void init(){
        System.out.println("Class dog init-method");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Class dog destroy-method");
    }*/

    public Dog() {
        System.out.println("Dog is created");
    }

    public  void say(){
        System.out.println("Bow-wow");
    }
}
