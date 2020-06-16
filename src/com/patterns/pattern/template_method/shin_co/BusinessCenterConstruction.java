package com.patterns.pattern.template_method.shin_co;

import static java.lang.System.out;

public class BusinessCenterConstruction extends ShinCoConstruction {

    @Override
    public void buildWalls() {
        out.println("Building Business Center Walls;");
    }

    @Override
    public void buildHeatingSystem() {
        out.println("Building Business Center Heating System;");
    }

    @Override
    public void buildCoolingSystem() {
        out.println("Building Business Center Cooling System;");
    }

    @Override
    public void installWindows() {
        out.println("Installing Business Center Windows;");
    }
}
