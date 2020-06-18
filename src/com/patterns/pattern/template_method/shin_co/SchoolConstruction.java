package com.patterns.pattern.template_method.shin_co;

import static java.lang.System.out;

public class SchoolConstruction extends ShinCoConstruction {

    @Override
    protected void buildWalls() {
        out.println("Building School Walls;");
    }

    @Override
    protected void buildHeatingSystem() {
        out.println("Building School Heating System;");
    }

    @Override
    protected void buildCoolingSystem() {
        out.println("Building School Cooling System;");
    }

    @Override
    protected void installWindows() {
        out.println("Installing School Windows;");
    }
}
