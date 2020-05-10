package com.cliq_fit.app.virtual_reality;

import com.cliq_fit.thirdparty_lib.virtual_reality.ParadiseWorkout;

public class ParadiseWorkoutMock implements ParadiseWorkout {

    private final ParadiseWorkoutImplementor paradiseWorkoutImplementor;

    public ParadiseWorkoutMock(ParadiseWorkoutImplementor paradiseWorkoutImplementor) {
        this.paradiseWorkoutImplementor = paradiseWorkoutImplementor;
    }

    @Override
    public void lookAbove() {
        this.paradiseWorkoutImplementor.lookAbove();
    }

    @Override
    public String[] howIsHere(String search) {
        return this.paradiseWorkoutImplementor.howIsHere(search);
    }
}
