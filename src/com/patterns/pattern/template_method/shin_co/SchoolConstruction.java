package com.patterns.pattern.template_method.shin_co;

import static java.lang.System.out;

public class SchoolConstruction extends ShinCoConstruction {

    @Override
    public void buildWalls() {
        out.println("Building School Walls;");
    }

    @Override
    public void buildHeatingSystem() {
        out.println("Building School Heating System;");
    }

    @Override
    public void buildCoolingSystem() {
        out.println("Building School Cooling System;");
    }

    @Override
    public void installWindows() {
        out.println("Installing School Windows;");
    }
}
