package com.luv2code.springboot.de.mycoolapp.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
@Component
@Qualifier("cricketCoach")
public class CricketCoach implements Coach{
    //define our init method
    public CricketCoach(){System.out.println("In constructor" +getClass().getName());}

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }
}
