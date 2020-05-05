package com.patterns.pattern.bridge.audioplayer;

import java.util.List;

public class MusicSourceCD implements MusicSourceImplementor {

    @Override
    public List<String> findMusicByAuthor(String author) {
        return List.of("CD: REF music by author 1", "CD: REF music by author 2");
    }

    @Override
    public List<String> findMusicByGenre(String genre) {
        return List.of("CD: REF music by genre 1", "CD: REF music by genre 2");
    }

    @Override
    public byte[] fetchMusicContent(String reference) {
        return "CD: music content".getBytes();
    }
}
