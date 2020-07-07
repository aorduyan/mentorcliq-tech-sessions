package com.patterns.pattern.abstract_factory.surgery;

import com.patterns.pattern.abstract_factory.surgery.environment.SurgeryEnvironmentFactory;

import static java.lang.System.out;

public class Surgery {

    private SurgeryEnvironmentFactory surgeryEnvironmentFactory;

    public Surgery(SurgeryEnvironmentFactory surgeryEnvironmentFactory) {
        this.surgeryEnvironmentFactory = surgeryEnvironmentFactory;
    }

    public void doSurgery() {
        prepareWard();
        prepareSurgeryTools();
    }

    private void prepareWard() {
        String wardName = this.surgeryEnvironmentFactory.getWard().getName();
        out.println("Prepare ward " + wardName);
    }

    private void prepareSurgeryTools() {
        String surgeryToolsName = this.surgeryEnvironmentFactory.getSurgeryTools().getName();
        out.println("Prepare surgery tools " + surgeryToolsName);
    }

}
