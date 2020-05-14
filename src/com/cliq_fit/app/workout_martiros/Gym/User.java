package Gym;

import WorkOutStrategy.StageStrategies.ExerciseStartegyStage.BoxingExercise;
import WorkOutStrategy.StageStrategies.ExerciseStartegyStage.ExerciseStrategy;
import WorkOutStrategy.StageStrategies.PrepareStrategyStage.PrepareStrategy;
import WorkOutStrategy.StageStrategies.PrepareStrategyStage.RunningPrepare;
import WorkOutStrategy.StageStrategies.StretchStrategyStage.StretchStrategy;
import WorkOutStrategy.StageStrategies.StretchStrategyStage.SwimmingStretch;

public class User {

    String userName;
    int userAge;
    int userWeight;
    int userHeight;
    ExerciseStrategy exerciseStrategy;
    PrepareStrategy prepareStrategy;
    StretchStrategy stretchStrategy;

    public User(String userName, int userAge,int userWeight, int userHeight, ExerciseStrategy exerciseStrategy,
                PrepareStrategy prepareStrategy, StretchStrategy stretchStrategy) {

        this.userName = userName;
        this.userAge = userAge;
        this.userWeight = userWeight;
        this.userHeight = userHeight;
        this.exerciseStrategy = exerciseStrategy;
        this.prepareStrategy = prepareStrategy;
        this.stretchStrategy = stretchStrategy;
    }

    public void doExercise() {
        this.exerciseStrategy.doExercise();
    }

    public void preparing() {
        this.prepareStrategy.preparing();
    }

    public void doStretching() {
        this.stretchStrategy.stretching();
    }



}
