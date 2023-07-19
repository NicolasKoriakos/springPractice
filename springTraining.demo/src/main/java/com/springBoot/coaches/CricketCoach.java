package com.springBoot.coaches;

import com.springBoot.interfaces.Coach;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice fast cricket bowling for 15 MIN";
    }
}
