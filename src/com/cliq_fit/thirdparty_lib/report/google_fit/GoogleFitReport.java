package com.cliq_fit.thirdparty_lib.report.google_fit;


import java.awt.image.BufferedImage;
import java.util.Map;
import java.util.Random;

import static java.lang.System.out;

public class GoogleFitReport implements GoogleFitReportServer {


    @Override
    public long avgTimeByMonth(int monthStart, int monthEnd) {
        return (monthEnd - monthStart) * (new Random().nextLong());
    }

    @Override
    public void goPublic(String title, BufferedImage bImage, Map.Entry<Double, Double> cords) {
        out.println("Here is my awesome result " + title +
                " " + bImage.toString() +
                " " + cords.getKey() +
                " " + cords.getValue());
    }
}
