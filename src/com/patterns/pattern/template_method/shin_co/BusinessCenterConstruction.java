package com.patterns.pattern.template_method.shin_co;

import static java.lang.System.out;

public class BusinessCenterConstruction extends ShinCoConstruction {

    @Override
    protected void buildWalls() {
        out.println("Building Business Center Walls;");
    }

    @Override
    protected void buildHeatingSystem() {
        out.println("Building Business Center Heating System;");
    }

    @Override
    protected void buildCoolingSystem() {
        out.println("Building Business Center Cooling System;");
    }

    @Override
    protected void installWindows() {
        out.println("Installing Business Center Windows;");
    }
}
