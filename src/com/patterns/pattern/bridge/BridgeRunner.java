package com.patterns.pattern.bridge;

import com.patterns.pattern.bridge.audioplayer.MusicSourceCD;
import com.patterns.pattern.bridge.audioplayer.initiallib.AudioPlayer;
import com.patterns.pattern.bridge.audioplayer.MusicSourceMock;
import com.patterns.run.PatternRunner;

public class BridgeRunner implements PatternRunner {

    @Override
    public void run() {
        demoAudioPlayer();
    }

    private static void demoAudioPlayer() {
        AudioPlayer audioPlayer = new AudioPlayer(new MusicSourceMock(new MusicSourceCD()));
        audioPlayer.playGoodMusic();
    }
}
