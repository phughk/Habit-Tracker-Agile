package com.kaznowski.hugh.services;

import com.kaznowski.hugh.models.Goal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HabitCalendar {

    private final Set<Goal> goals = new HashSet<>();

    public void addGoal(Goal goal) {
        goals.add(goal);
    }

    public List<Goal> getAllGoals() {
        return new ArrayList<>(goals);
    }
}
