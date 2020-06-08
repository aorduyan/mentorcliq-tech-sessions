package com.patterns.pattern.decorator.car_tuning;

public class TuningServiceDecorator implements TuningService {

    private TuningService tuningService;

    public TuningServiceDecorator(TuningService tuningService) {
        this.tuningService = tuningService;
    }

    @Override
    public String getDescription() {
        return tuningService.getDescription();
    }

    @Override
    public int getPrice() {
        return tuningService.getPrice();
    }
}
