package com.cliq_fit.app.report;

import com.cliq_fit.app.report.server.CliqFitReportServer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class CliqFitReportClient {

    private final CliqFitReportServer cliqFitReportServer;

    public CliqFitReportClient(CliqFitReportServer cliqFitReportServer) {
        this.cliqFitReportServer = cliqFitReportServer;
    }

    public void printLastYearsReport(int numberOfYear) {
        long avg = cliqFitReportServer.avgTimeByYear(numberOfYear);
        System.out.println("Here is my last " + numberOfYear + " year result! " + avg);
    }

    public void share(String postTitle) {
        double lat = 40.18;
        double lng = 44.51;
        cliqFitReportServer.shareYourResult(postTitle, getImageByte(), lat, lng);
    }

    private byte[] getImageByte() {
        String address = "https://www.mentorcliq.com/hs-fs/hubfs/lpm-mq-web-assets/imgs/mq-logos/mentorcliQ-logo-bug-boxed.png";

        try {
            URL url = new URL(address);
            BufferedImage image = ImageIO.read(url);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ImageIO.write(image, "png", bos );
            return bos.toByteArray();
        } catch (MalformedURLException e) {
            e.printStackTrace();
            //TODO log something useful
        } catch (IOException e) {
            e.printStackTrace();
            //TODO log something useful
        }

        byte[] imageByte = {};
        return imageByte;
    }

}
