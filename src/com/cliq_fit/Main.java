package com.cliq_fit;

import com.cliq_fit.app.report.CliqFitReport;
import com.cliq_fit.app.report.CliqFitReportClient;
import com.cliq_fit.app.report.server.adapter.GoogleCliqFitReportServerAdapter;
import com.cliq_fit.thirdparty_lib.report.google_fit.GoogleFitReport;

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
