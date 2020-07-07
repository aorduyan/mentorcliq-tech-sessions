package com.patterns.pattern.abstract_factory.surgery.environment;

import com.patterns.pattern.abstract_factory.surgery.environment.model.SurgeryTools;
import com.patterns.pattern.abstract_factory.surgery.environment.model.Ward;
import com.patterns.pattern.abstract_factory.surgery.environment.model.hospital.HospitalSurgeryTools;
import com.patterns.pattern.abstract_factory.surgery.environment.model.hospital.HospitalWard;

public class HospitalEnvironmentFactory implements SurgeryEnvironmentFactory {

    @Override
    public Ward getWard() {
        return new HospitalWard();
    }

    @Override
    public SurgeryTools getSurgeryTools() {
        return new HospitalSurgeryTools();
    }
}
