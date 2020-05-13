package com.cliq_fit.app.workout;

public class WorkoutFactory {

    public static Workout buildWorkout(WorkoutType workoutType) {
        switch (workoutType) {
            case SWIMMING_RELAX:
                //return new Workout(...);
            case SWIMMING_CHAMPION:
                //return new Workout(...);
            case BOXING:
                //return new Workout(boxing_related_warmaup, boxing_related_exercise, boxing_related_stretching);
            case RUNNING:
                //return new Workout(...);
            case DOESNT_MAKE_SENSE_COMBINATION:
                //return new Workout(...);
            default:
                throw new RuntimeException("Unknown workout type = " + workoutType);
        }
    }
}
