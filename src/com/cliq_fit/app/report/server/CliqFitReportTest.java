package com.cliq_fit.app.report.server;

import java.util.Random;

import static java.lang.System.out;

public class CliqFitReportTest implements CliqFitReportServer {

    @Override
    public long avgTimeByYear(int year) {
        return year * (new Random().nextLong());
    }

    @Override
    public void shareYourResult(String title, byte[] image, double latitude, double longitude) {
        out.println("Here is my awesome result " + title + image.toString() + latitude + longitude);
    }
}
