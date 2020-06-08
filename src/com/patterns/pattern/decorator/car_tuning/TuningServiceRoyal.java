package com.patterns.pattern.decorator.car_tuning;

public class TuningServiceRoyal implements TuningService {

    @Override
    public String getDescription() {
        return "Royal Tuning AutoService";
    }

    @Override
    public int getPrice() {
        //This is the base price
        return 1000;
    }
}
