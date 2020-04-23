package com.patterns.strategy.impl.strategy.attack;

import static java.lang.System.out;

public class StrategyAttackShoot implements StrategyAttack {

    @Override
    public void doOperation() {
        out.println("Small");
    }
}
