package com.cliq_fit.thirdparty_lib.report.google_fit;

import java.awt.image.BufferedImage;
import java.util.Map;

public interface GoogleFitReportServer {

    long avgTimeByMonth(int monthStart, int monthEnd);

    void goPublic(String title, BufferedImage bImage, Map.Entry<Double, Double> cords);

}
