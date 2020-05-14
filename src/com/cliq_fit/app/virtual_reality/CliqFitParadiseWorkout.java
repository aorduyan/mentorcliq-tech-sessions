package com.cliq_fit.app.virtual_reality;

import com.cliq_fit.thirdparty_lib.virtual_reality.ParadiseWorkout;

public class CliqFitParadiseWorkout implements ParadiseWorkout {

    private final ParadiseWorkoutImplementor paradiseWorkoutImplementor;

    public CliqFitParadiseWorkout(ParadiseWorkoutImplementor paradiseWorkoutImplementor) {
        this.paradiseWorkoutImplementor = paradiseWorkoutImplementor;
    }

    @Override
    public void lookAbove() {
        this.paradiseWorkoutImplementor.lookAbove();
    }

    @Override
    public String[] howIsHere() {
        return this.paradiseWorkoutImplementor.howIsHere();
    }
}
