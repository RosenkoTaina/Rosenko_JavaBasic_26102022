package com.hillel.rosenko.lessons.lesson3;

import java.lang.Math;
import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double L;
        double W;
        double H;
        System.out.println("Задайте довжину");
        L = input.nextDouble();
        System.out.println("Задайте ширину");
        W = input.nextDouble();
        System.out.println("Задайте висоту");
        H = input.nextDouble();
        input.close();

        System.out.println("Розрахунок:");

        // об'єм V=L*W*H
        double Volume;
        Volume = L*W*H;
        System.out.println("Об'єм паралелепіпеда = " + Volume);

        // площа поверхні S=2(L*W+L*H+W*H)
        double SurfaceArea;
        final int S = 2;
        SurfaceArea = S*((L*W)+(L*H)+(W*H));
        System.out.println("Площа паралелепіпеда = " + SurfaceArea);

        // площа основи So=W*L
        double SurfaceAreaO;
        SurfaceAreaO = W*L;
        System.out.println("Площа основи паралелепіпеда = " + SurfaceAreaO);

        // площа бічної поверхні Sb=2*H*(L+W)
        double SurfaceAreab;
        SurfaceAreab = S*H*(L+W);
        System.out.println("Площа бічної поверхні паралелепіпеда = " + SurfaceAreab);

        // Довжина діагоналі прямокутного паралелепіпеда d=√L^2 + W^2 + H^2

        double V1 = Math.pow(L,S);
        double V2 = Math.pow(W,S);
        double V3 = Math.pow(H,S);
        double result = V1+V2+V3;
        double Diagonal = Math.sqrt(result);


        System.out.printf("Просторова діагональ = " + Math.round(Diagonal));


    }
}
