package com.cliq_fit;

import com.cliq_fit.app.configuration.FitConfig;
import com.cliq_fit.app.report.CliqFitReport;
import com.cliq_fit.app.report.CliqFitReportClient;
import com.cliq_fit.app.report.server.adapter.GoogleCliqFitReportServerAdapter;
import com.cliq_fit.app.workout.Workout;
import com.cliq_fit.app.workout.WorkoutFactory;
import com.cliq_fit.app.workout.WorkoutType;
import com.cliq_fit.thirdparty_lib.report.google_fit.GoogleFitReport;

public class Main {

    public static void main(String[] args) {
        FitConfig fitConfig = loadConfiguration(WorkoutType.SWIMMING_CHAMPION);
        doWorkout(fitConfig);

        fitConfig = loadConfiguration(WorkoutType.BOXING);
        doWorkout(fitConfig);

        showOffWithResults();
        goToVR();
    }

    private static FitConfig loadConfiguration(WorkoutType workoutType) {
        return FitConfig.getInstance(workoutType);
    }

    private static void doWorkout(FitConfig fitConfig) {
        Workout workout = WorkoutFactory.buildWorkout(fitConfig.getFavoriteWorkoutType());
        workout.doWorkout();
    }

    private static void showOffWithResults() {
        CliqFitReportClient cliqFitReportClient = new CliqFitReportClient(new CliqFitReport());
        cliqFitReportClient.printLastYearsReport(5);
        cliqFitReportClient.share("I am awesome!");

        GoogleFitReport googleFitReport = new GoogleFitReport();
        cliqFitReportClient = new CliqFitReportClient(new GoogleCliqFitReportServerAdapter(googleFitReport));
        cliqFitReportClient.printLastYearsReport(1);
        cliqFitReportClient.share("I am an awesome google user!");
    }

    private static void goToVR() {
        //Virtual reality workout: bridge pattern
    }

}
