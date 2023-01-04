package com.hillel.rosenko.lessons.lesson13.homework16;

public class MusicStyles {

    private String name;
    private String artist;

    public MusicStyles(String name, String artist) {
        this.name = name;
        this.artist = artist;
    }

    public void playMusic() {
        System.out.println(this.getArtist() + " starts playing " + this.getName());
    }
    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

}
