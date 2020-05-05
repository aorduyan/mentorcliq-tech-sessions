package com.patterns.pattern.bridge.audioplayer;

import com.patterns.pattern.bridge.audioplayer.initiallib.MusicSource;

public class MusicSourceMock implements MusicSource {

    private final MusicSourceImplementor musicSourceImplementor;

    public MusicSourceMock(MusicSourceImplementor musicSourceImplementor) {
        this.musicSourceImplementor = musicSourceImplementor;
    }

    @Override
    public String[] findMusicByAuthor(String author) {
        return musicSourceImplementor.findMusicByAuthor(author).toArray(new String[0]);
    }

    @Override
    public String[] findMusicByGenre(String genre) {
        return musicSourceImplementor.findMusicByGenre(genre).toArray(new String[0]);
    }

    @Override
    public byte[] fetchMusicContent(String reference) {
        return musicSourceImplementor.fetchMusicContent(reference);
    }

}

