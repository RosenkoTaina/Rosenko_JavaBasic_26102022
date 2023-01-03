package com.hillel.rosenko.lessons.lesson13.homework16;

public class RockMusic extends MusicStyles {
    public RockMusic(String name) {
        super(name);
    }

    @Override
    public void playMusic() {
        System.out.println("the Rock music starts playing...");
    }
}
