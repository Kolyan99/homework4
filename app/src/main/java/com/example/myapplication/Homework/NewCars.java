package com.example.myapplication.Homework;


public class NewCars {
    public static void main(String[] args) {

        Car Ferreri = new Car("Ferrari", 380, 2000000);
        Car BMV = new Car("BMV", 350, 1500000);
        Car Bugatti = new Car("Bugatti", 400, 30000000);
        try {
            Ferreri.Startmotor();
        } catch (Car.NotbrandCar e) {
            System.out.println(e.getMessage());
        }
        try {
            BMV.Startmotor();
        } catch (Car.NotbrandCar e) {
            System.out.println(e.getMessage());
        }
        try {
            Bugatti.Startmotor();
        } catch (Car.NotbrandCar e) {
            System.out.println(e.getMessage());
        }
    }
}

class Car {

    private String brand;
    private int speed;
    private int price;

    public Car(String brand, int speed, int price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

    public Car() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    void Startmotor() throws NotbrandCar {
        final int min = 0;
        final int max = 20;
        final int random = min + (int) (Math.random() * ((max - min) + 1));
        if (random % 2 == 0) {
            throw new NotbrandCar("Car don't start " + brand);
        } else {
            System.out.println("Car start " + brand);
        }
    }

    class NotbrandCar extends Exception {

        private String message;

        NotbrandCar() {
            this.message = message;
        }

        public NotbrandCar(String s) {
        }

        @Override
        public String getMessage() {
            return message;
        }
    }
}


