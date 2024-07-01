package com.luv2code.springboot.de.mycoolapp.config;

import com.luv2code.springboot.de.mycoolapp.common.Coach;
import com.luv2code.springboot.de.mycoolapp.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    //define a bean method to configure the bean
    @Bean
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
