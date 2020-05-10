package com.cliq_fit.app.report.server;

public interface CliqFitReportServer {

    long avgTimeByYear(int year);

    void shareYourResult(String title, byte[] image, double latitude, double longitude);

}
