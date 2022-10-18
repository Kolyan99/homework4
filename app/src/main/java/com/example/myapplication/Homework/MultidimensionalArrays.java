package com.example.myapplication.Homework;


public class MultidimensionalArrays {

    public static void main(String[] args) {

        int[][] massive = new int[4][4];
        for (int i = 0; i < massive.length; i++) {
            for (int a = 0; a < massive.length; a++) {
                massive[i][a] = (int) (Math.random() * 20);
                System.out.print(" " + massive[i][a] + " ");
            }
            System.out.println();
        }
    }
}















