package com.patterns.pattern.abstract_factory;

import com.patterns.pattern.abstract_factory.surgery.Surgery;
import com.patterns.pattern.abstract_factory.surgery.environment.ToyEnvironmentFactory;
import com.patterns.run.PatternRunner;

public class AbstractFactoryRunner implements PatternRunner {

    @Override
    public void run() {
        Surgery surgery = new Surgery(new ToyEnvironmentFactory());
        surgery.doSurgery();
    }

}
