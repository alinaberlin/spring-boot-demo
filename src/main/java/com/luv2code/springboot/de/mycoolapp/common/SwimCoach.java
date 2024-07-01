package com.luv2code.springboot.de.mycoolapp.common;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("swimCoach")
public class SwimCoach implements Coach{
    public SwimCoach(){
        System.out.println("In constructor" + getClass().getName());
    }
    @Override
    public String getDailyWorkout() {
        return "Swim 100 meters as a warm up";
    }
}
