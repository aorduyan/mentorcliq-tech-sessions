package com.patterns.pattern.abstract_factory.surgery.environment.model.hospital;

import com.patterns.pattern.abstract_factory.surgery.environment.model.Ward;

public class HospitalWard implements Ward {

    @Override
    public String getName() {
        return "Hospital ward";
    }
}
