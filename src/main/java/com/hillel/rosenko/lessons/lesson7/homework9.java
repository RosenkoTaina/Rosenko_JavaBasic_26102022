package com.hillel.rosenko.lessons.lesson7;
import java.util.Arrays;

public class homework9 {

    public static void main(String[] args) {

        int[] team1 = new int[25];
        for (int i = 0; i < team1.length; i++) {
            team1[i] = 18 + (int) (Math.random() * 23);
        }
        System.out.println("Team 1 players age:" + Arrays.toString(team1));
        int sum = 0;
        for (int i : team1){
            sum += i;
            }
        System.out.println("Total sum is " + sum);
        float average1;
        average1 = (float) sum / (team1.length);
        System.out.println("The average age is " + average1);

        int [] team2 = new int[25];
        for (int i = 0; i < team2.length ; i++) {
            team2[i] = 18 + (int) (Math.random() * 23);
        }
        System.out.println("Team 2 players age:" + Arrays.toString(team2));
         int sum2 = 0;
         for (int i : team2) {
             sum2 += i;
         }
        System.out.println("Total sum is " + sum2);
        float average2;
        average2 = (float) sum2 / team2.length;
        System.out.println("The average age " + average2);
    }
}

// Є дві команди регбі з 25 гравців різного віку у кожній.
//Вік беремо випадковим чином в діапазоні від 18 до 40.
//Виведіть у двох рядках вік гравців кожної команди.
//Порахуйте середній вік гравців кожної команди та виведіть на екран.



