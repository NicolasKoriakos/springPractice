package com.springBoot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class stateRestController {

    @Value("${coach.name}")
    private String coachName;
    @Value("${team.name}")
    private String teamName;

    // Expose Endpoints
    @GetMapping("/")
    public String sayHello(){
        return "hello World";
    }

    @GetMapping("/run")
    public String sayRun(){ return "Running 50K!";}

    @GetMapping("/workout")
    public String sayWorkout() {return "Lifting weight";}

    @GetMapping("/team")
    public String showTeam() {return "The team name is " + teamName + " and the team coach is " + coachName;}
}
