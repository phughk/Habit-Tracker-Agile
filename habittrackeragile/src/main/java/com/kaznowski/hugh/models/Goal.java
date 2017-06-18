package com.kaznowski.hugh.models;

import lombok.Data;

import java.time.LocalTime;
import java.time.Period;

@Data
public class Goal {
    private String name;
    private LocalTime startTime;
    private LocalTime endTime;
    private Period repeatingPeriod;
}
