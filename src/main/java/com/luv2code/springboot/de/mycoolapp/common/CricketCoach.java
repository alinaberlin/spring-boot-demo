package com.luv2code.springboot.de.mycoolapp.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
@Component
public class CricketCoach implements Coach{
    //define our init method
    public CricketCoach(){System.out.println("In constructor" +getClass().getName());}
    @PostConstruct
    public void doMyStartUpStuff(){
        System.out.println("Print ceva" +getClass().getName());
    }

    //define our destroy method
    @PreDestroy
    public void destroyMyStartUpStuff(){
        System.out.println("Destroy ceva" +getClass().getName());
    }


    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }
}
