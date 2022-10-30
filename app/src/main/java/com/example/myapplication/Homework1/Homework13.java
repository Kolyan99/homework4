package com.example.myapplication.Homework1;

public class Homework13 {
    public static void main(String[] args) {

        ThreadClass threadClass = new ThreadClass();
        threadClass.start();
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
        }
        System.out.println();

        ThreadClass1 threadClass1 = new ThreadClass1();
        threadClass1.start();
    }
}

class ThreadClass extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Output of numbers " + i);
        }
    }
}

class ThreadClass1 extends Thread {
    @Override
    public void run() {
        for (int i = 5; i <= 10; i++) {
            System.out.println("Output of numbers " + i);
        }
    }
}
