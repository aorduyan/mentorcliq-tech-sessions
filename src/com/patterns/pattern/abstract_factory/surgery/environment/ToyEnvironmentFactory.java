package com.patterns.pattern.abstract_factory.surgery.environment;

import com.patterns.pattern.abstract_factory.surgery.environment.model.SurgeryTools;
import com.patterns.pattern.abstract_factory.surgery.environment.model.Ward;
import com.patterns.pattern.abstract_factory.surgery.environment.model.toy.ToySurgeryTools;
import com.patterns.pattern.abstract_factory.surgery.environment.model.toy.ToyWard;

public class ToyEnvironmentFactory implements SurgeryEnvironmentFactory {

    @Override
    public Ward getWard() {
        return new ToyWard();
    }

    @Override
    public SurgeryTools getSurgeryTools() {
        return new ToySurgeryTools();
    }
}
