package com.luv2code.springboot.de.mycoolapp.rest;

import com.luv2code.springboot.de.mycoolapp.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private  final Coach fCoach;
    private  Coach myCoach;
    @Autowired
    public DemoController(@Qualifier("Football") Coach fCoach)
    {
        this.fCoach = fCoach;
    }
   @Autowired
    public void getCoach (@Qualifier("cricketCoach") Coach myCoach){
        this.myCoach=myCoach;

    }
    @GetMapping("/daily-workout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
    @GetMapping("/daily-footbal")
    public String getDailyFootball(){
        return fCoach.getDailyWorkout();
    }

}
