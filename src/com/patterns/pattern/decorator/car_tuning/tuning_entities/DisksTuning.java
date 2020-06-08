package com.patterns.pattern.decorator.car_tuning.tuning_entities;

import com.patterns.pattern.decorator.car_tuning.TuningService;
import com.patterns.pattern.decorator.car_tuning.TuningServiceDecorator;

public class DisksTuning extends TuningServiceDecorator {

    public DisksTuning(TuningService tuningService) {
        super(tuningService);
    }

    public String getDescription() {
        return super.getDescription() + " Disk Tuning";
    }

    public int getPrice() {
        return super.getPrice() + 100;
    }

}
