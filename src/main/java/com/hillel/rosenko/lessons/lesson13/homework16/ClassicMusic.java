package com.hillel.rosenko.lessons.lesson13.homework16;

public class ClassicMusic extends MusicStyles{

    public ClassicMusic(String name, String artist) {
        super(name, artist);
    }

    @Override
    public void playMusic() {
        System.out.println(this.getArtist() + " starts playing Classic Music");
    }
}

