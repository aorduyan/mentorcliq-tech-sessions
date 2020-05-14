package com.cliq_fit.thirdparty_lib.virtual_reality;

import java.util.Arrays;

public class VRGlass {

    private final ParadiseWorkout paradiseWorkout;

    public VRGlass(ParadiseWorkout paradiseWorkout) {
        this.paradiseWorkout = paradiseWorkout;
    }

    public void enjoyFreedom() {
        paradiseWorkout.lookAbove();
        String[] whoIsHere = paradiseWorkout.howIsHere();

        System.out.println(Arrays.toString(whoIsHere));
    }
}
