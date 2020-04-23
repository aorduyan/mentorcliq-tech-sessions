package com.patterns.strategy.impl.strategy.move;

import static java.lang.System.out;

public class StrategyMoveWalk implements StrategyMove {

    public void doOperation() {
        out.println("Walk");
    }
}
