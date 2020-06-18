package com.patterns.pattern.template_method.shin_co;

import static java.lang.System.out;

public abstract class ShinCoConstruction {

    public final void doConstruction() {
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

    private void buildParkingArea() {
        out.println("Building Parking Area");
    }

    private void buildSewageSystem() {
        out.println("Building Sewage System");
    }

    protected boolean needsWindows() {
        return true;
    }

    protected void buildCustomStuff() {
        //do nothing, leave for concrete constructions to implement, now or in the future
    }

    protected abstract void buildWalls();
    protected abstract void buildHeatingSystem();
    protected abstract void buildCoolingSystem();
    protected abstract void installWindows();

}
