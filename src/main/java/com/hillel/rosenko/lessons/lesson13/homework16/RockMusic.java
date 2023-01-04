package com.hillel.rosenko.lessons.lesson13.homework16;

public class RockMusic extends MusicStyles {
    public RockMusic(String name, String artist) {
        super(name, artist);
    }
    @Override
    public void playMusic() {
        System.out.println(this.getArtist() + " starts playing Rock Music");
    }
}
