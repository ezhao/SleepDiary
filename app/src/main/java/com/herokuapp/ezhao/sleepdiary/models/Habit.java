package com.herokuapp.ezhao.sleepdiary.models;

public class Habit {
    private String habitName;

    public Habit(String habitName) {
        this.habitName = habitName;
    }

    public String getHabitName() {
        return habitName;
    }
}
