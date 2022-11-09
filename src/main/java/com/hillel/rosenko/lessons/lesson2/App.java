package com.hillel.rosenko.lessons.lesson2;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {

        double x;
        double y;
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter latitude coordinates please (DD.dddddd format)");
        x = reader.nextDouble();
        String latitude = String.valueOf(x);
        System.out.println("Enter longitude coordinates please (DD.dddddd format)");
        y = reader.nextDouble();
        String longitude = String.valueOf(y);
        reader.close();

        // First coordinate calculation
        int ValueDegreesX = (int) x;
        float ValueMinutesX = (float) (60 * (x - Math.floor(x)));
        float ValueSecondsX = (float) (60 * (ValueMinutesX - Math.floor(ValueMinutesX)));

        System.out.println("Degrees X: " + ValueDegreesX + '\u00B0');
        System.out.println("Minutes X: " + (int) ValueMinutesX + '\u2032');
        System.out.println("Seconds X: " + (int) ValueSecondsX + '\u2033');


        // Second coordinate calculation
        int ValueDegreesY = (int) y;
        float ValueMinutesY = (float) (60 * (y - Math.floor(y)));
        float ValueSecondsY = (float) (60 * (ValueMinutesY - Math.floor(ValueMinutesY)));

        System.out.println("Degrees Y: " + ValueDegreesY + '\u00B0');
        System.out.println("Minutes Y: " + (int) ValueMinutesY + '\u2032');
        System.out.println("Seconds Y: " + (int) ValueSecondsY + '\u2033');

        System.out.printf("Your latitude DD'MM'SS.s' format: %d\u00B0 %.0f\u2032 %.1f\u2033 \n",
                ValueDegreesX, Math.floor(ValueMinutesX), ValueSecondsX);
        System.out.printf("Your longitude DD'MM'SS.s' format: %d\u00B0 %.0f\u2032 %.1f\u2033 \n",
                ValueDegreesY, Math.floor(ValueMinutesY), ValueSecondsY);
    }
}



//        a°b'c" = (a + b/60 + c/3600)°
//        http://www.calculatorlakhm.com/index.php?name=Coordinates
