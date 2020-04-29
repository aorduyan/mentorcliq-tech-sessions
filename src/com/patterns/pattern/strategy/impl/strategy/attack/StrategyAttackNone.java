package com.patterns.pattern.strategy.impl.strategy.attack;

import static java.lang.System.out;

public class StrategyAttackNone implements StrategyAttack {

    @Override
    public void doOperation() {
        out.println("No Attack");
    }
}
