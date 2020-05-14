package com.cliq_fit.app.workout;

import com.cliq_fit.app.workout.stage.exercise.*;
import com.cliq_fit.app.workout.stage.stretch.*;
import com.cliq_fit.app.workout.stage.warmup.*;

class Workout {

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
    public void warmUp() {
        warmUpStage.doOperation();
    }

    public void exercise() {
        exerciseStage.doOperation();
    }

    public void stretch() {
        stretchStage.doOperation();
    }

    public WarmUpStage getWarmUpStage() {
        return warmUpStage;
    }

    public void setWarmUpStage(WarmUpStage warmUpStage) {
        this.warmUpStage = warmUpStage;
    }

    public ExerciseStage getExerciseStage() {
        return exerciseStage;
    }

    public void setExerciseStage(ExerciseStage exerciseStage) {
        this.exerciseStage = exerciseStage;
    }

    public StretchStage getStretchStage() {
        return stretchStage;
    }

    public void setStretchStage(StretchStage stretchStage) {
        this.stretchStage = stretchStage;
    }
}
