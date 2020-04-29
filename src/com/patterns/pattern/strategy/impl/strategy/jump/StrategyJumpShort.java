package com.patterns.pattern.strategy.impl.strategy.jump;

import static java.lang.System.out;

public class StrategyJumpShort implements StrategyJump {

    @Override
    public void doOperation() {
        out.println("Jump Short");
    }
}
