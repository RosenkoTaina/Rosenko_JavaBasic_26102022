package com.hillel.rosenko.lessons.lesson13.homework15;

public interface OS {
    default void printOS(int os) {
        switch (os) {
            case 0:
                System.out.println("LinuxOS");
                break;
            case 1:
                System.out.println("iOS");
                break;
            default:
                System.out.println("operating system");
        }
    }
}

//
//        if (os == LINUXES)
//            System.out.println("LinuxOS");
//        else if (os == IOS)
//            System.out.println("iOS");
//        else
//            System.out.println("Something is wrong");

