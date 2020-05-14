import Gym.Gym;
import Gym.User;
import WorkOutStrategy.StageStrategies.ExerciseStartegyStage.RunningExercise;
import WorkOutStrategy.StageStrategies.PrepareStrategyStage.BoxingPrepare;
import WorkOutStrategy.StageStrategies.StretchStrategyStage.SwimmingStretch;


public class Main {

    public static void main(String[] args) {
        User user = new User("Peter",24,85,182,
                new RunningExercise(),new BoxingPrepare(),new SwimmingStretch());


        Gym gym  = Gym.getInstance();
        gym.addUser(user);

        gym.startWorkOut(user);


    }

}
