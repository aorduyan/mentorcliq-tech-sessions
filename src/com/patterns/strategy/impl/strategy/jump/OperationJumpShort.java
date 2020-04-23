package com.patterns.strategy.impl.strategy.jump;

import static java.lang.System.out;

public class OperationJumpShort implements StrategyJump {

    @Override
    public void doOperation() {
        out.println("Jump Short");
    }
}
