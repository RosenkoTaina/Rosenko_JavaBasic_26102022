package com.hillel.rosenko.lessons.lesson10;

import java.util.Scanner;

public class Euclid {
public static int gcd(int p, int q){
if (q == 0) return p;
return gcd(q, p % q);
            }
            public static void main(String[] args)
            {
                Scanner input = new Scanner(System.in);
                int p = input.nextInt();
                int q = input.nextInt();
                int divisor = gcd(p, q);

                System.out.println(divisor);
        }
    }

