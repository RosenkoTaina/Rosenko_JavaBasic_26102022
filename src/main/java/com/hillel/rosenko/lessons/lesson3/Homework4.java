package com.hillel.rosenko.lessons.lesson3;

public class Homework4 {
    public static void main(String[] args) {

        double L;
        double W;
        double H;

        L = 6;
        W = 6;
        H = 7;

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

        System.out.printf("Просторова діагональ = " + Diagonal);





    }
}
