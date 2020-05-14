package com.cliq_fit.app.configuration;

import com.cliq_fit.app.workout.WorkoutType;

import java.util.HashMap;
import java.util.Map;

import static java.lang.System.out;

public class FitConfig {

    private WorkoutType favoriteWorkoutType;
    private double userHeight;
    private int userWeight;
    private int userHeartRate;

    private static volatile Map<WorkoutType, FitConfig> instances = new HashMap<>();

    private FitConfig(WorkoutType favoriteWorkoutType) {
        out.println("Load FirConfig for " + favoriteWorkoutType);

        this.favoriteWorkoutType = favoriteWorkoutType;
        this.userHeight = 180;//TODO get from mobile
        this.userWeight = 80;//TODO get from mobile
        this.userHeartRate = 80;//TODO get from mobile
    }

    public static FitConfig getInstance(WorkoutType favoriteWorkoutType) {
        if (!instances.containsKey(favoriteWorkoutType)) {
            synchronized (FitConfig.class) {
                if (!instances.containsKey(favoriteWorkoutType)) {
                    FitConfig instance = new FitConfig(favoriteWorkoutType);
                    instances.put(favoriteWorkoutType, instance);
                }
            }
        }

        return instances.get(favoriteWorkoutType);
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

    public int getUserHeartRate() {
        return userHeartRate;
    }
}
