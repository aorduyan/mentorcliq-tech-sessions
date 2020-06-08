package com.patterns.pattern.decorator;

import com.patterns.pattern.decorator.car_tuning.TuningService;
import com.patterns.pattern.decorator.car_tuning.TuningServiceRoyal;
import com.patterns.pattern.decorator.car_tuning.tuning_entities.DisksTuning;
import com.patterns.pattern.decorator.car_tuning.tuning_entities.EngineTuning;
import com.patterns.pattern.decorator.car_tuning.tuning_entities.TierTuning;
import com.patterns.run.PatternRunner;

import static java.lang.System.out;

public class DecoratorRunner implements PatternRunner {

    @Override
    public void run() {
        TuningService tuningService = new DisksTuning(new TierTuning(new TuningServiceRoyal()));
        out.println(tuningService.getDescription());
        out.println(tuningService.getPrice());


        tuningService = new TierTuning(new EngineTuning(new TuningServiceRoyal()));
        out.println(tuningService.getDescription());
        out.println(tuningService.getPrice());
    }
}
