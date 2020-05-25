package com.patterns.pattern.facade.tool;

import static java.lang.System.out;

public class SoundSystem {

    public void setVolumeLow() {
        out.println("The sound volume is low.");
    }

    public void setVolumeMid() {
        out.println("The sound volume is medium.");
    }

    public void setVolumeHigh() {
        out.println("The sound volume is high.");
    }

    public void setEqualizerFlat() {
        out.println("The equalizer is flat.");
    }

    public void setEqualizerParty() {
        out.println("The equalizer is party.");
    }

    public void setEqualizerHigh() {
        out.println("The equalizer is high.");
    }

    public void setEqualizerOutdoors() {
        out.println("The equalizer is Outdoors.");
    }

    public void setEqualizerRelax() {
        out.println("The equalizer is Relax.");
    }

    public void turnOff() {
        out.println("The sound system is turned off.");
    }

}
