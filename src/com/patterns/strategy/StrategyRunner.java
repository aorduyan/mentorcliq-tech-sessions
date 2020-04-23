package com.patterns.strategy;

import com.patterns.strategy.impl.Mario;
import com.patterns.strategy.impl.strategy.attack.StrategyAttackNone;
import com.patterns.strategy.impl.strategy.display.StrategyDisplayBig;
import com.patterns.strategy.impl.strategy.jump.OperationJumpShort;
import com.patterns.strategy.impl.strategy.move.StrategyMoveRun;

public class StrategyRunner {

    public static void run() {
        Mario mario = new Mario(new StrategyDisplayBig(), new StrategyAttackNone(), new StrategyMoveRun(), new OperationJumpShort());
        mario.display();
        mario.attack();
        mario.move();
        mario.jump();
    }

}
