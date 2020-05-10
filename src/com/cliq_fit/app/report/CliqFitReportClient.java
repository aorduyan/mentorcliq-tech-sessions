package com.cliq_fit.app.report;

import com.cliq_fit.app.report.server.CliqFitReportServer;

public class CliqFitReportClient {

    private final CliqFitReportServer cliqFitReportServer;

    public CliqFitReportClient(CliqFitReportServer cliqFitReportServer) {
        this.cliqFitReportServer = cliqFitReportServer;
    }

    public void printLastYearsReport(int numberOfYear) {
        //Use cliqFitReportServer.avgTimeByYear();
    }

    public void share() {
        //Use cliqFitReportServer.shareYourResult();
    }

}
