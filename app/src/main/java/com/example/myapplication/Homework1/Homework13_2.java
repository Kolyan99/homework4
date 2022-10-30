package com.example.myapplication.Homework1;

public class Homework13_2 {
    public static void main(String[] args) {
        // 2 задача
        ThredClass2 thredClass2 = new ThredClass2();
        thredClass2.start();

        RunnableClass runnableClass = new RunnableClass();
        Thread thread = new Thread(runnableClass);
        thread.start();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Today the temperature is 12 degrees");
            }
        };
        Thread thread1 = new Thread(runnable);
        thread1.start();

        Thread thread2 = new Thread() {
            @Override
            public void run() {
                System.out.println("The weather is windy");
            }
        };
        thread2.start();


        // 3 задача
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println();
                System.out.println("Create a new thread");
            }
        };
        Thread thread3 = new Thread(runnable1);
        thread3.start();
    }
}

class ThredClass2 extends Thread {
    @Override
    public void run() {
        System.out.println("Today is sunny weather");
    }
}

class RunnableClass implements Runnable {
    @Override
    public void run() {
        System.out.println("Yesterday was cool weather");
    }
}


