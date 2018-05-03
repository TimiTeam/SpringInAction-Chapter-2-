package com.gmail.timurworkspace;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc {
    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    public String play() {
        return "Playing "+artist+" - "+title;
    }
}
