package com.patterns.pattern.abstract_factory.surgery.environment;

import com.patterns.pattern.abstract_factory.surgery.environment.model.SurgeryTools;
import com.patterns.pattern.abstract_factory.surgery.environment.model.Ward;

public interface SurgeryEnvironmentFactory {

    Ward getWard();
    SurgeryTools getSurgeryTools();

}
