package com.cliq_fit.app.workout;

import com.cliq_fit.app.workout.stage.exercise.*;
import com.cliq_fit.app.workout.stage.stretch.*;
import com.cliq_fit.app.workout.stage.warmup.*;

public class WorkoutFactory {

    public static Workout buildWorkout(WorkoutType workoutType) {
        switch (workoutType) {
            case SWIMMING_RELAX:
                return new Workout(new WarmUpStageShoulder(), new ExerciseStageYoga(), new StretchStageLegs());
            case SWIMMING_CHAMPION:
                return new Workout(new WarmUpStageShoulder(), new ExerciseStageSwimmingAdvanced(), new StretchStageLegs());
            case BOXING:
                return new Workout(new WarmUpStageLegs(), new ExerciseStageShoulder(), new StretchStageShoulder());
            case RUNNING:
                return new Workout(new WarmUpStageLegs(), new ExerciseStageLegs(), new StretchStageLegs());
            case DOESNT_MAKE_SENSE_COMBINATION:
                return new Workout(new WarmUpStageAbs(), new ExerciseStageYoga(), new StretchStageShoulder());
            default:
                throw new RuntimeException("Unknown workout type = " + workoutType);
        }
    }
}
