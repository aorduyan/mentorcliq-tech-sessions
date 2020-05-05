package com.patterns.pattern.bridge.audioplayer;

import java.util.List;

public interface MusicSourceImplementor {

    List<String> findMusicByAuthor(String author);
    List<String> findMusicByGenre(String genre);
    byte[] fetchMusicContent(String reference);

}
