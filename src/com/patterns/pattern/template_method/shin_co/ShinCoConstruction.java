package com.patterns.pattern.template_method.shin_co;

import static java.lang.System.out;

public abstract class ShinCoConstruction {

    public void doConstruction() {
        buildParkingArea();
        buildSewageSystem();
        buildWalls();
        buildHeatingSystem();
        buildCoolingSystem();
        if (needsWindows()) {
            installWindows();
        }
        buildCustomStuff();
    }

    public final void buildParkingArea() {
        out.println("Building Parking Area");
    }

    public final void buildSewageSystem() {
        out.println("Building Sewage System");
    }

    public boolean needsWindows() {
        return true;
    }

    public void buildCustomStuff() {
        //do nothing, leave for concrete constructions to implement, now or in the future
    }

    public abstract void buildWalls();
    public abstract void buildHeatingSystem();
    public abstract void buildCoolingSystem();
    public abstract void installWindows();

}
