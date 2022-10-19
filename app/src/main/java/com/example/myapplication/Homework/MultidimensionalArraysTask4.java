package com.example.myapplication.Homework;

public class MultidimensionalArraysTask4 {
    public static void main(String[] args) {
        int[][][] massive4 = new int[2][2][2];
        for (int i = 0; i < massive4.length; i++) {
            for (int a = 0; a < massive4.length; a++) {
                for (int b = 0; b < massive4.length; b++) {
                    massive4[i][a][b] = (int) (Math.random() * 50);
                    System.out.print(" " + massive4[i][a][b] + " ");
                }
                System.out.println();
            }
        }
    }
}
