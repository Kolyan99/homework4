package com.example.myapplication.Homework;

import java.util.Arrays;

public class Massiv_2 {
    public static void main(String[] args) {
        // Задача 6
        int[] massiv = {21, 71, 55, 20, 29, 5, 7, 10, 19, 18, 23, 70};

        boolean sort = false;
        int number;

        while (!sort) {
            sort = true;
            for (int i = 0; i < massiv.length - 1; i++) {
                if (massiv[i] > massiv[i + 1]) {
                    sort = false;

                    number = massiv[i];
                    massiv[i] = massiv[i + 1];
                    massiv[i + 1] = number;
                }
            }
        }
        System.out.println(Arrays.toString(massiv));

        // Задача 7

        int[] massive2 = {88, 39, 22, 44, 65, 1, 12, 54, 67, 20, 2, 9, 39};

        for (int i = 1; i < massive2.length; i++) {
            int current = massive2[i];
            int newValue = i - 1;
            while (newValue >= 0 && current < massive2[newValue]) {
                massive2[newValue + 1] = massive2[newValue];
                newValue--;
            }
            massive2[newValue + 1] = current;
        }
        System.out.println(Arrays.toString(massive2));


    }
}
