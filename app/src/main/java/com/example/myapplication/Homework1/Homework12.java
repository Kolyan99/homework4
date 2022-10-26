package com.example.myapplication.Homework1;

public class Homework12 {
    public static void main(String[] args) {

        Child child = new Child(10, "Liza", 110);
        Adult adult = new Adult(18, "Liza", 165);
        Child child1 = new Child(14, "Sasha", 130);
        Adult adult1 = new Adult(22, "Sasha", 168);

        Igrowingup<Child> igrowingup;
        igrowingup = (t) -> adult;
        Adult resalt = igrowingup.transformation(child);
        System.out.println(resalt);

        Igrowingup<Child> igrowingup1;
        igrowingup1 = (t) -> adult1;
        Adult resalt1 = igrowingup1.transformation(child1);
        System.out.println(resalt1);
        System.out.println("age:" + resalt1.getAge() + " name:" + resalt1.getName() + " " + "growth:" + resalt1.getGrowth());
    }

    static class Child {
        private int age;
        private String name;
        private int growth;

        public Child(int age, String name, int growth) {
            this.age = age;
            this.name = name;
            this.growth = growth;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        public int getGrowth() {
            return growth;
        }

        @Override
        public String toString() {
            return "Child{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    ", growth=" + growth +
                    '}';
        }
    }

    static class Adult {
        private int age;
        private String name;
        private int growth;

        public Adult(int age, String name, int growth) {
            this.age = age;
            this.name = name;
            this.growth = growth;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        public int getGrowth() {
            return growth;
        }

        @Override
        public String toString() {
            return "Adult{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    ", growth=" + growth +
                    '}';
        }
    }

    interface Igrowingup<T> {
        Adult transformation(T t);

    }
}


