package com.gmail.timurworkspace;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by admin on 03.05.2018.
 */

@Component
public class CDPlayer {
    private CompactDisc cd;
    private String correctSong;

    @Autowired
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    public CompactDisc getCd() {
        return cd;
    }

    public String getCorrectSong() {
        return correctSong;
    }

    @Autowired
    public void setCd(CompactDisc cd) {
        this.cd = cd;
    }

    public void play(){
        correctSong = cd.play();
    }
}
