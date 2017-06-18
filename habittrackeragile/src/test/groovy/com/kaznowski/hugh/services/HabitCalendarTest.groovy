package com.kaznowski.hugh.services

import com.kaznowski.hugh.models.Goal
import spock.lang.Specification
import spock.lang.Subject

class HabitCalendarTest extends Specification {

    @Subject
    HabitCalendar subject

    def setup() {
        subject = new HabitCalendar()
    }

    def "A stored goal can be retrieved"() {

        given:
        Goal goal = new Goal()

        when:
        subject.addGoal(goal)

        then:
        subject.getAllGoals() == [goal]
    }

}

