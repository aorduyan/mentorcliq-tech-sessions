package com.cliq_fit;

public class Main {

    public static void main(String[] args) {
        loadConfiguration();
        doWorkout();
        showOffWithResults();
        goToVR();
    }

    private static void loadConfiguration() {
        //Load the config: singleton pattern
    }

    private static void doWorkout() {
        //Do the workouts based on configuration preference (swimming/boxing/runing): strategy pattern
    }

    private static void showOffWithResults() {
        //print the log and share the result (use different APIs): adapter pattern
    }

    private static void goToVR() {
        //Virtual reality workout: bridge pattern
    }

}
