package com.hillel.rosenko.lessons.lesson13.homework16;

public class PopMusic extends MusicStyles {

    public PopMusic(String name, String artist) {
        super(name, artist);
    }
    @Override
    public void playMusic() {
        System.out.println(this.getArtist() + " starts playing Pop Music");
    }
}
