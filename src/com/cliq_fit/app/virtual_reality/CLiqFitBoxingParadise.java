package com.cliq_fit.app.virtual_reality;

public class CLiqFitBoxingParadise implements ParadiseWorkoutImplementor {

    @Override
    public void lookAbove() {
        System.out.println("Ooops, you got punched in the paradise!");
    }

    @Override
    public String[] howIsHere() {
        String[] greatBoxers = new String[]{"Mike Tyson", "Ali", "Vik"};
        return greatBoxers;
    }
}
