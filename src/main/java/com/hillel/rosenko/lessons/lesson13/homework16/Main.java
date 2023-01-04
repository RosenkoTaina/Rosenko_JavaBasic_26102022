package com.hillel.rosenko.lessons.lesson13.homework16;

public class Main {
    public static void main(String[] args) {

       MusicStyles[] musicStyles = {
               new ClassicMusic("Classic Music", "Mozart"),
               new PopMusic("Pop Music", "Lady Gaga"),
               new RockMusic("Rock Music", "Scorpions")
       };

        for (MusicStyles MusicStyles : musicStyles) {
            MusicStyles.playMusic();
        }
    }

}
