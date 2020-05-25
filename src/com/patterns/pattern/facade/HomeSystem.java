package com.patterns.pattern.facade;

import com.patterns.pattern.facade.tool.AirSystem;
import com.patterns.pattern.facade.tool.LightSystem;
import com.patterns.pattern.facade.tool.SoundSystem;

import static java.lang.System.out;

public class HomeSystem {

    LightSystem lightSystem;
    SoundSystem soundSystem;
    AirSystem airSystem;

    public HomeSystem(LightSystem lightSystem, SoundSystem soundSystem, AirSystem airSystem) {
        this.lightSystem = lightSystem;
        this.soundSystem = soundSystem;
        this.airSystem = airSystem;
    }

    public void tuneForWorkout() {
        out.println("-----------Let's workout!-----------");
        lightSystem.setLightMid();
        soundSystem.setEqualizerOutdoors();
        soundSystem.setVolumeMid();
        airSystem.setHumidityHigh();
        airSystem.setTemperatureLow();
    }

    public void tuneForWorkReturn() {
        out.println("-----------I return from work!-----------");
        lightSystem.setLightLow();
        soundSystem.setEqualizerFlat();
        soundSystem.setVolumeMid();
        airSystem.setHumidityMedium();
        airSystem.setTemperatureMedium();
    }

    public void tuneForParty() {
        out.println("-----------Let's start the party!-----------");
        lightSystem.setLightHigh();
        soundSystem.setEqualizerParty();
        soundSystem.setVolumeHigh();
        airSystem.setHumidityLow();
        airSystem.setTemperatureMedium();
    }

    public void tuneForPartyOver() {
        out.println("-----------The party is over!-----------");
        lightSystem.setLightOff();
        soundSystem.setEqualizerRelax();
        soundSystem.setVolumeLow();
        airSystem.setHumidityMedium();
        airSystem.setTemperatureLow();
    }

    public void tuneForVacation() {
        out.println("-----------I am going on a vacation!-----------");
        lightSystem.setLightOff();
        soundSystem.turnOff();
        airSystem.setHumidityLow();
        airSystem.setTemperatureLow();
    }

}
