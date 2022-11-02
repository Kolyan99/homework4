package com.example.myapplication.Homework14;

public class StoreClass {
    public static void main(String[] args) {
        Store store = new Store();
        Producer producer = new Producer(store);
        Consumer consumer = new Consumer(store);
        new Thread(producer).start();
        new Thread(consumer).start();

    }
}

class Producer implements Runnable {
    Store store;

    Producer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 1; i < 8; i++) {
            store.put();
        }
    }
}

class Consumer implements Runnable {
    Store store;

    Consumer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 1; i < 8; i++) {
            store.get();
        }
    }
}

class Store {
    private int product = 0;

    synchronized void get() {
        while (product < 1) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println("get interrupted");
            }
        }
        product--;
        System.out.println("item sold 1");
        System.out.println("products available: " + product);
        try {
            Thread.sleep(300);
        } catch (Exception e) {
        }
        notify();
    }

    synchronized void put() {
        while (product >= 1) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println("get interrupted");
            }
        }
        product++;
        System.out.println("goods to be produced 1");
        System.out.println("products available: " + product);
        notify();
    }
}


