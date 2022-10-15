package com.example.myapplication.Homework;


import java.util.Arrays;

public class Massiv {
    public static void main(String[] args) {
        // Задание 1
        int[] massiv = new int[11];
        for (int i = 1; i <= massiv.length - 1; i++) {
            massiv[i] = i * 2;
        }
        String massiveValues = Arrays.toString(massiv);
        System.out.println(massiveValues);
        System.out.println();
        for (int i = 1; i <= massiv.length - 1; i++) {
            System.out.println(massiv[i]);
        }
        System.out.println();
        // Задание 2
        int[] massive2 = new int[100];
        for (int i = 1; i <= massive2.length - 1; i += 2) {
            massive2[i] = i;
            System.out.print(massive2[i] + " ");
        }
        System.out.println();

        for (int b = massive2.length - 1; b >= 0; b -= 2) {
            massive2[b] = b;
            System.out.print(massive2[b] + " ");
        }
        System.out.println();

        // Задача 3

        System.out.println();
        int[] massive3 = new int[15];
        int y = 0;
        for (int i = 0; i < massive3.length; i++) {
            massive3[i] = (int) (Math.random() * 99);
            if (massive3[i] % 2 == 0) {
                y++;
            }
            System.out.print(massive3[i] + " ");
        }
        System.out.println();
        System.out.println("number of even numbers " + y);

        // Задача 4
        System.out.println();

        int[] massive4 = new int[20];
        for (int i = 0; i < massive4.length; i++) {
            massive4[i] = (int) (Math.random() * 20);
            System.out.print(massive4[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < massive4.length; i++) {
            if (massive4[i] % 2 != 0) massive4[i] = 0;
            System.out.print(massive4[i] + "  ");
        }

    }
}



    


