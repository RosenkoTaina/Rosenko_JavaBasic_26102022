package com.hillel.rosenko.lessons.lesson3;

import java.lang.Math;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {

        double L;
        double W;
        double H;

        Scanner input = new Scanner(System.in);
        boolean valid = false;
        while (!valid) {
            System.out.println("Задайте довжину ");
            L = input.nextDouble();
            System.out.println("Задайте ширину ");
            W = input.nextDouble();
            System.out.println("Задайте висоту ");
            H = input.nextDouble();

            try {
                if (L >= 1 && L <= 1000000 && W >= 1 && W <= 1000000 && H >= 1 && H <= 1000000) {
                    valid = true;
                    double Volume;
                    Volume = L * W * H;
                    System.out.println("Об'єм паралелепіпеда: " + Volume);

                    // площа поверхні S=2(L*W+L*H+W*H)
                    double SurfaceArea;
                    final int S = 2;
                    SurfaceArea = S * ((L * W) + (L * H) + (W * H));
                    System.out.println("Площа паралелепіпеда: " + SurfaceArea);

                    // площа основи So=W*L
                    double SurfaceAreaO;
                    SurfaceAreaO = W * L;
                    System.out.println("Площа основи паралелепіпеда: " + SurfaceAreaO);

                    // площа бічної поверхні Sb=2*H*(L+W)
                    double SurfaceAreaB;
                    SurfaceAreaB = S * H * (L + W);
                    System.out.println("Площа бічної поверхні паралелепіпеда: " + SurfaceAreaB);

                    // Довжина діагоналі прямокутного паралелепіпеда d=√L^2 + W^2 + H^2

                    double V1 = Math.pow(L, S);
                    double V2 = Math.pow(W, S);
                    double V3 = Math.pow(H, S);
                    double result = V1 + V2 + V3;
                    double Diagonal = Math.sqrt(result);
                    System.out.println("Просторова діагональ:  " + Math.round((Diagonal * 100) / 100));


                } else {
                    System.out.println("Невірне значення");
                }
            } catch (InputMismatchException e) {
                System.out.println("Невірне значення");
                input.next();

            }

        }
    }
}











