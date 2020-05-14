package com.cliq_fit.app.configuration;

import com.cliq_fit.app.workout.WorkoutType;

import static java.lang.System.out;

public class FitConfig {

    private WorkoutType favoriteWorkoutType;
    private double userHeight;
    private int userWeight;
    private int userAge;

    private static volatile FitConfig instance;

    private FitConfig(WorkoutType favoriteWorkoutType) {
        out.println("Load FirConfig for " + favoriteWorkoutType);

        this.favoriteWorkoutType = favoriteWorkoutType;
        this.userHeight = 180;//TODO get from mobile
        this.userWeight = 80;//TODO get from mobile
        this.userAge = 80;//TODO get from mobile
    }

    public static FitConfig getInstance(WorkoutType favoriteWorkoutType) {
        if (instance == null) {
            synchronized (FitConfig.class) {
                if (instance == null) {
                    instance = new FitConfig(favoriteWorkoutType);
                }
            }
        }

        return instance;
    }

    public WorkoutType getFavoriteWorkoutType() {
        return favoriteWorkoutType;
    }

    public double getUserHeight() {
        return userHeight;
    }

    public int getUserWeight() {
        return userWeight;
    }

    public int getUserAge() {
        return userAge;
    }
}
