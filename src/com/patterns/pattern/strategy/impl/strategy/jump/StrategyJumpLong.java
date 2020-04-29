package com.patterns.pattern.strategy.impl.strategy.jump;

import static java.lang.System.out;

public class StrategyJumpLong implements StrategyJump {

    @Override
    public void doOperation() {
        out.println("Jump Long");
    }
}
