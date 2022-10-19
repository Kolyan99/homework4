package com.example.myapplication.Homework;


import java.util.Arrays;

public class MultidimensionalArraysTask3 {
    public static void main(String[] args) {
        int[][] massive3 = new int[][]{{4, 2, 1, 3}, {8, 7, 6, 5}};
        Arrays.sort(massive3[0]);
        for (int i = massive3.length - 1; i > 0; i--) {
        }
        for (int i = 0; i < massive3.length; i++) {
            for (int j = 0; j < massive3[i].length; j++) {
                System.out.print(massive3[i][j] + "\t");
            }
            System.out.println();
        }
    }
}






























