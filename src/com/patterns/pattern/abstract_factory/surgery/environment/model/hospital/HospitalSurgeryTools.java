package com.patterns.pattern.abstract_factory.surgery.environment.model.hospital;

import com.patterns.pattern.abstract_factory.surgery.environment.model.SurgeryTools;

public class HospitalSurgeryTools implements SurgeryTools {

    @Override
    public String getName() {
        return "Hospital surgery tools";
    }
}
