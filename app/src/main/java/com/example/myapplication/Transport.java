package com.example.myapplication;

public class Transport {
    public static void main(String[] args) {
        Traktor traktor =new Traktor();
        Car car = new Car();
        Bike bike = new Bike();
        traktor.drive();
        traktor.honk();
        traktor.StartMotor();
        car.drive();
        car.honk();
        car.StartMotor();
        bike.drive();
        bike.honk();
    }
}
class Traktor extends Transportt implements Istart{

    @Override
    void drive() {
        System.out.println("Tractor drive");
    }
    @Override
    void honk() {
        System.out.println("Tractor honk");
    }

    @Override
    public void StartMotor() {
        System.out.println("Start Motor");

    }
}
class Car extends Transportt implements Istart{

    @Override
    void drive() {
        System.out.println("Car drive");
    }
    @Override
    void honk() {
        System.out.println("Car honk");
    }

    @Override
    public void StartMotor() {
        System.out.println("Start Motor");
    }
}
class Bike extends Transportt{

    @Override
    void drive() {
        System.out.println("Bike drive");
    }
    @Override
    void honk() {
        System.out.println("Bike honk");
    }
}
abstract class Transportt{

    abstract void drive();
    abstract void honk();
}

interface Istart{
    void StartMotor();
}

