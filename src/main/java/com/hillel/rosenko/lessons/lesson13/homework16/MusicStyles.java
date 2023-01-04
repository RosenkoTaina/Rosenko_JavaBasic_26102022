package com.hillel.rosenko.lessons.lesson13.homework16;

public class MusicStyles {

    private String name;
    private final String artist;

    public MusicStyles(String name, String artist) {
        this.name = name;
        this.artist = artist;
    }

    public void playMusic() {
        System.out.println(getArtist() + " starts playing " + getName());
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

}
