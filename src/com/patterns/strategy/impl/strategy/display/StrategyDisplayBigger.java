package com.patterns.strategy.impl.strategy.display;

import static java.lang.System.out;

public class StrategyDisplayBigger implements StrategyDisplay {

    @Override
    public void doOperation() {
        out.println("Bigger");
    }
}
