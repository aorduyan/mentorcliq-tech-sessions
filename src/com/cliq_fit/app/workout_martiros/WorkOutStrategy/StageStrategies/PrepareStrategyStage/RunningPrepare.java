package WorkOutStrategy.StageStrategies.PrepareStrategyStage;

public class RunningPrepare implements PrepareStrategy {
    @Override
    public void preparing() {
        System.out.println("Run for 30 minutes");
    }
}
