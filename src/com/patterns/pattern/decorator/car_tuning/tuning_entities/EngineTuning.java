package com.patterns.pattern.decorator.car_tuning.tuning_entities;

import com.patterns.pattern.decorator.car_tuning.TuningService;
import com.patterns.pattern.decorator.car_tuning.TuningServiceDecorator;

public class EngineTuning extends TuningServiceDecorator {

    public EngineTuning(TuningService tuningService) {
        super(tuningService);
    }

    public String getDescription() {
        return super.getDescription() + " Engine Tuning";
    }

    public int getPrice() {
        return super.getPrice() + 500;
    }

}
