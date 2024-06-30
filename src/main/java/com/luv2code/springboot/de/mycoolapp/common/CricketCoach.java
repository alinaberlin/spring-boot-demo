package com.luv2code.springboot.de.mycoolapp.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
@Component
@Lazy
public class CricketCoach implements Coach{
    public CricketCoach(){
        System.out.println("Pula");

    }
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }
}
