package com.patterns.pattern.strategy;

import com.patterns.pattern.strategy.impl.Mario;
import com.patterns.pattern.strategy.impl.strategy.attack.StrategyAttackNone;
import com.patterns.pattern.strategy.impl.strategy.display.StrategyDisplayBig;
import com.patterns.pattern.strategy.impl.strategy.jump.StrategyJumpShort;
import com.patterns.pattern.strategy.impl.strategy.move.StrategyMoveRun;

public class StrategyRunner {

    public static void run() {
        Mario mario = new Mario(new StrategyDisplayBig(), new StrategyAttackNone(), new StrategyMoveRun(), new StrategyJumpShort());
        mario.display();
        mario.attack();
        mario.move();
        mario.jump();
    }

}
