package com.example.myapplication.Homework;


import java.util.Arrays;

public class MultidimensionalArraysTask2 {
    public static void main(String[] args) {

        int[][][] massive2 = {
                {
                        {1, 3, 4, 5},
                        {1, 2, 3}
                },
                {
                        {1, 5, 8, 9}
                }
        };
        for (int numbers2D = 0; numbers2D < massive2.length; numbers2D++) {
            for (int numbers1D = 0; numbers1D < massive2[numbers2D].length; numbers1D++) {
                for (int numbers = 0; numbers < massive2[numbers2D][numbers1D].length; numbers++) {
                    System.out.print(massive2[numbers2D][numbers1D][numbers] + "\t");
                }
                System.out.println();
            }

        }
        System.out.print(Arrays.deepToString(massive2));
    }
}

