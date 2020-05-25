package com.patterns.pattern.facade;

import com.patterns.pattern.facade.tool.AirSystem;
import com.patterns.pattern.facade.tool.LightSystem;
import com.patterns.pattern.facade.tool.SoundSystem;
import com.patterns.run.PatternRunner;

public class FacadeRunner implements PatternRunner {

    @Override
    public void run() {
        HomeSystem homeSystem = new HomeSystem(new LightSystem(), new SoundSystem(), new AirSystem());
        homeSystem.tuneForParty();
        homeSystem.tuneForPartyOver();
        homeSystem.tuneForVacation();
    }

}
