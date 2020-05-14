package com.cliq_fit.app.workout;

import com.cliq_fit.app.workout.stage.exercise.*;
import com.cliq_fit.app.workout.stage.stretch.*;
import com.cliq_fit.app.workout.stage.warmup.*;

public class Workout {

    private WarmUpStage warmUpStage;
    private ExerciseStage exerciseStage;
    private StretchStage stretchStage;

    public Workout(WarmUpStage warmupStage, ExerciseStage exerciseStage, StretchStage stretchStage) {
        this.warmUpStage = warmupStage;
        this.exerciseStage = exerciseStage;
        this.stretchStage = stretchStage;
    }

    //please define members and stable behaviors

    //varying behaviors
    private void warmUp() {
        warmUpStage.doOperation();
    }

    private void exercise() {
        exerciseStage.doOperation();
    }

    private void stretch() {
        stretchStage.doOperation();
    }

    public void doWorkout() {
        warmUp();
        exercise();
        stretch();
    }

}
