package com.luv2code.springboot.de.mycoolapp.common;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Football")
public class FotballCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Footbal training";
    }
}
