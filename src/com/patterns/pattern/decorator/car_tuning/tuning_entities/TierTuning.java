package com.patterns.pattern.decorator.car_tuning.tuning_entities;

import com.patterns.pattern.decorator.car_tuning.TuningService;
import com.patterns.pattern.decorator.car_tuning.TuningServiceDecorator;

public class TierTuning extends TuningServiceDecorator {

    public TierTuning(TuningService tuningService) {
        super(tuningService);
    }

    public String getDescription() {
        return super.getDescription() + " Tier Tuning";
    }

    public int getPrice() {
        return super.getPrice() + 50;
    }

}
