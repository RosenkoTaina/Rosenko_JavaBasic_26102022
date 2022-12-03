package com.hillel.rosenko.lessons.lesson5;

import java.util.Scanner;
public class Homework6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter Team 1 name ");
        String Team1 = input.nextLine();
        System.out.println("Please enter Team 2 name ");
        String Team2 = input.nextLine();

        int Player1;
        Player1 = Validator.getInt("Please enter count frags player1 Team 1 ");
        System.out.println(Player1);

        int Player2;
        Player2 = Validator.getInt("Please enter count frags player2 Team 1 ");
        System.out.println(Player2);

        int Player3;
        Player3 = Validator.getInt("Please enter count frags player3 Team 1 ");
        System.out.println(Player3);

        int Player4;
        Player4 = Validator.getInt("Please enter count frags player4 Team 1 ");
        System.out.println(Player4);

        int Player5;
        Player5 = Validator.getInt("Please enter count frags player5 Team 1 ");
        System.out.println(Player5);

        int Player6;
        Player6 = Validator.getInt("Please enter count frags player6 Team 2 ");
        System.out.println(Player6);

        int Player7;
        Player7 = Validator.getInt("Please enter count frags player7 Team 2 ");
        System.out.println(Player7);

        int Player8;
        Player8 = Validator.getInt("Please enter count frags player8 Team 2 ");
        System.out.println(Player8);

        int Player9;
        Player9 = Validator.getInt("Please enter count frags player9 Team 2 ");
        System.out.println(Player9);

        int Player10;
        Player10 = Validator.getInt("Please enter count frags player10 Team 2 ");
        System.out.println(Player10);

        input.close();

        int Mean1;
        Mean1 = (Player1 + Player2 + Player3 + Player4 + Player5) / 5;
        int Mean2;
        Mean2 = (Player6 + Player7 + Player8 + Player9 + Player10) / 5;

        System.out.println("arithmetic mean " + Team1 + " = " + Mean1);
        System.out.println("arithmetic mean " + Team2 + " = " + Mean2);

        if (Mean1 > Mean2) {
            System.out.println("FINAL RESULT: Team 1 WIN");
        } else if (Mean1 < Mean2) {
            System.out.println("FINAL RESULT: Team 2 WIN");
        } else {
            System.out.println("FINAL RESULT: DRAW");
        }

    }

}







