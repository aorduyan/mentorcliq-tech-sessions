package com.patterns.pattern.strategy.impl;

import com.patterns.pattern.strategy.impl.strategy.attack.StrategyAttack;
import com.patterns.pattern.strategy.impl.strategy.display.StrategyDisplay;
import com.patterns.pattern.strategy.impl.strategy.jump.StrategyJump;
import com.patterns.pattern.strategy.impl.strategy.move.StrategyMove;

public class Mario {

    private StrategyDisplay strategyDisplay;
    private StrategyAttack strategyAttack;
    private StrategyMove strategyMove;
    private StrategyJump strategyJump;

    public Mario(StrategyDisplay strategyDisplay, StrategyAttack strategyAttack, StrategyMove strategyMove, StrategyJump strategyJump) {
        this.strategyDisplay = strategyDisplay;
        this.strategyAttack = strategyAttack;
        this.strategyMove = strategyMove;
        this.strategyJump = strategyJump;
    }

    public void display() {
        this.strategyDisplay.doOperation();
    }

    public void attack() {
        this.strategyAttack.doOperation();
    }

    public void move() {
        this.strategyMove.doOperation();
    }

    public void jump() {
        this.strategyJump.doOperation();
    }

}
