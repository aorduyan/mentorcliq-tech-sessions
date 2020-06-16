package com.patterns.pattern.template_method;

import com.patterns.pattern.template_method.shin_co.BusinessCenterConstruction;
import com.patterns.pattern.template_method.shin_co.MilitaryBaseConstruction;
import com.patterns.pattern.template_method.shin_co.SchoolConstruction;
import com.patterns.pattern.template_method.shin_co.ShinCoConstruction;
import com.patterns.run.PatternRunner;

public class TemplateMethodRunner implements PatternRunner {

    @Override
    public void run() {
        ShinCoConstruction militaryBaseConstruction = new MilitaryBaseConstruction();
        militaryBaseConstruction.doConstruction();
        ShinCoConstruction schoolConstruction = new SchoolConstruction();
        schoolConstruction.doConstruction();
        ShinCoConstruction businessCenterConstruction = new BusinessCenterConstruction();
        businessCenterConstruction.doConstruction();
    }
}
