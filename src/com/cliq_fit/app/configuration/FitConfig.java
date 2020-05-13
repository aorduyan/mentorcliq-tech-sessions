package com.cliq_fit.app.configuration;

import com.cliq_fit.app.workout.WorkoutType;

public class FitConfig {

    private WorkoutType favoriteWorkoutType;
    private double userHeight;
    private int userWeight;
    private int userAge;
    private int userGender;

    public FitConfig(WorkoutType favoriteWorkoutType, double userHeight, int userWeight, int userAge, int userGender) {
        this.favoriteWorkoutType = favoriteWorkoutType;
        this.userHeight = userHeight;
        this.userWeight = userWeight;
        this.userAge = userAge;
        this.userGender = userGender;
    }

    public WorkoutType getFavoriteWorkoutType() {
        return favoriteWorkoutType;
    }

    public void setFavoriteWorkoutType(WorkoutType favoriteWorkoutType) {
        this.favoriteWorkoutType = favoriteWorkoutType;
    }

    public double getUserHeight() {
        return userHeight;
    }

    public void setUserHeight(double userHeight) {
        this.userHeight = userHeight;
    }

    public int getUserWeight() {
        return userWeight;
    }

    public void setUserWeight(int userWeight) {
        this.userWeight = userWeight;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public int getUserGender() {
        return userGender;
    }

    public void setUserGender(int userGender) {
        this.userGender = userGender;
    }
}
