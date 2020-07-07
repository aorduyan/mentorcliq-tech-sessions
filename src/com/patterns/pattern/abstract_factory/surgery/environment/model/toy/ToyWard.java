package com.patterns.pattern.abstract_factory.surgery.environment.model.toy;

import com.patterns.pattern.abstract_factory.surgery.environment.model.Ward;

public class ToyWard implements Ward {

    @Override
    public String getName() {
        return "Toy ward";
    }
}
