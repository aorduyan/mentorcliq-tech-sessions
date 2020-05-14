package com.cliq_fit.app.workout;
import com.cliq_fit.app.workout.stage.exercise*;
import com.cliq_fit.app.workout.stage.stretch.*;
import com.cliq_fit.app.workout.stage.warmup.*;

public class WorkoutFactory {

    public static Workout buildWorkout(WorkoutType workoutType) {
        switch (workoutType) {
            case SWIMMING_RELAX:
                return new Workout(new WarmupStageShoulder(), new ExerciseStageYoga(), new StretchStageLegs());
            case SWIMMING_CHAMPION:
                return new Workout(new WarmupStageShoulder(), new ExerciseStageSwimmingAdvanced(), new StretchStageLegs());
            case BOXING:
                return new Workout(new WarmupStageLegs(), new ExerciseStageShoulder(), new StretchStageShoulder());
            case RUNNING:
                return new Workout(new WarmupStageLegs(), new ExerciseStageLegs(), new StretchStageLegs());
            case DOESNT_MAKE_SENSE_COMBINATION:
                return new Workout(new WarmupStageAbs(), new ExerciseStageYoga(), new StretchStageShoulders());
            default:
                throw new RuntimeException("Unknown workout type = " + workoutType);
        }
    }
}
