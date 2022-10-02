package com.example.myapplication;

public class Run {
    public static void main(String[] args) {
        Crow crow = new Crow();
        Pigeon pigeon = new Pigeon();
        pigeon.fly();
        crow.fly();
    }
}
class Pigeon extends Bird{

    @Override
    void fly() {
        System.out.println("Pigeon fly");

    }
}
class Crow extends Bird{

    @Override
    void fly() {
        System.out.println("Crow fly");
    }
}
abstract class Bird{
    abstract void fly();
}