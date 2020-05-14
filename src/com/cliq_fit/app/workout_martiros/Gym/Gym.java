package Gym;

import WorkOutStrategy.Workout;

import java.util.ArrayList;
import java.util.List;

public class Gym implements Workout{



    List<User> users;

    private static Gym gym = null;

    private Gym(){
        this.users = new ArrayList<User>();
    }

    public static Gym getInstance(){
        if(gym == null) {
            gym = new Gym();
        }
        return gym;
    }

    public void addUser(User user){
        System.out.println(user.userName + " Added to gym");
        this.users.add(user);
    }

    public void removeUser(User user){
        System.out.println(user.userName + " Removed from gym");
        this.users.remove(user);
    }


    @Override
    public void startWorkOut(User user) {
        user.doExercise();
        user.preparing();
        user.doStretching();
    }
}
