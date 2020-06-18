package com.patterns.pattern.template_method.shin_co;

import static java.lang.System.out;

public class MilitaryBaseConstruction extends ShinCoConstruction {

    @Override
    protected void buildWalls() {
        out.println("Building Military Base Walls;");
    }

    @Override
    protected void buildHeatingSystem() {
        out.println("Building Military Base Heating System;");
    }

    @Override
    protected void buildCoolingSystem() {
        out.println("Building Military Base Cooling System;");
    }

    @Override
    protected void installWindows() {
        //no windows here for security
    }

    @Override
    protected boolean needsWindows() {
        return false;
    }
}
