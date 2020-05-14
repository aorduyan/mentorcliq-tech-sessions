package com.cliq_fit.app.report.server.adapter;

import com.cliq_fit.app.report.server.CliqFitReportServer;
import com.cliq_fit.thirdparty_lib.report.google_fit.GoogleFitReportServer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Map;

public class GoogleCliqFitReportServerAdapter implements CliqFitReportServer {

    private GoogleFitReportServer googleFitReportServer;

    public GoogleCliqFitReportServerAdapter(GoogleFitReportServer googleFitReportServer) {
        this.googleFitReportServer = googleFitReportServer;
    }

    @Override
    public long avgTimeByYear(int year) {
        int monthStart = -12 * year;
        int monthEnd = -12 * year;

        return googleFitReportServer.avgTimeByMonth(monthStart, monthEnd);
    }

    @Override
    public void shareYourResult(String title, byte[] image, double latitude, double longitude) {
        ByteArrayInputStream bais = new ByteArrayInputStream(image);
        BufferedImage bufferedImage = null;
        try {
            bufferedImage = ImageIO.read(bais);
        } catch (IOException e) {
            //TODO some useful logging
            e.printStackTrace();
        }

        Map.Entry<Double, Double> cords =
                new AbstractMap.SimpleEntry<Double, Double>(latitude, longitude);
        googleFitReportServer.goPublic(title, bufferedImage, cords);
    }
}
