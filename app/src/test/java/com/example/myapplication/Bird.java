package com.example.myapplication;

public class  Bird {
    void Fly(){

    }

    public static void main(String[] args) {
        Bird bird = new Bird() {
            @Override
            void Fly() {
                System.out.println("Летать ");

            }
        };
        Bird bird1 = new Bird() {
            @Override
            void Fly() {

            }
        };

    }
}
abstract class Crow{
    abstract void Fly();
}
abstract class Pigeon{
    abstract void Fly();
}
