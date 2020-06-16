package com.patterns.pattern.template_method.shin_co;

import static java.lang.System.out;

public class MilitaryBaseConstruction extends ShinCoConstruction {

    @Override
    public void buildWalls() {
        out.println("Building Military Base Walls;");
    }

    @Override
    public void buildHeatingSystem() {
        out.println("Building Military Base Heating System;");
    }

    @Override
    public void buildCoolingSystem() {
        out.println("Building Military Base Cooling System;");
    }

    @Override
    public void installWindows() {
        //no windows here for security
    }

    @Override
    public boolean needsWindows() {
        return false;
    }
}
