package com.example.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Couch myCoach;

    @Autowired
    public DemoController(Couch couch){
        myCoach = couch;
    }

    @GetMapping("/dailyWorkouts")
    public String getDailyWorkouts(){
        return  myCoach.getDailyWorkout();
    }
}
