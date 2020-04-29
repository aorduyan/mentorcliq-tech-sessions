package com.patterns.pattern.strategy.impl.strategy.display;

import static java.lang.System.out;

public class StrategyDisplayBig implements StrategyDisplay {

    @Override
    public void doOperation() {
        out.println("Big");
    }
}
