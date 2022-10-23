package com.example.myapplication.Homework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class HomeScore {
    public static void main(String[] args) {
        Score score = new Score();
        score.Addproduct();
        score.Getallgoods();
        score.Deleteitem();
        score.Edititem();
        LinkedList<Product> products = new LinkedList();
        products.add(new Product(12, "Banana", 27));
        products.add(new Product(25, "Kiwi", 20));
        products.add(new Product(12, "Banana", 27));
        products.add(new Product(18, "Apple", 35));
        products.add(new Product(13, "Orange", 32));
        products.add(new Product(18, "Apple", 35));
        products.add(new Product(30, "Grape", 24));

        products.sort(Comparator.comparingLong(Product::getPrice));
        System.out.println(products);
        products.remove(2);
        System.out.println(products);
        products.add(new Product(35, "Pear", 40));
        System.out.println(products);

    }
}

class Product {
    private int id;
    private String name;
    private int price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

class Score {

    public void Addproduct() {
        TreeMap treeMap = new TreeMap();
        treeMap.put(12, "Banana");
        treeMap.put(25, "Kiwi");
        treeMap.put(12, "Banana");
        treeMap.put(18, "Apple");
        treeMap.put(13, "Orange");
        treeMap.put(18, "Apple");
        treeMap.put(30, "Grape");
        System.out.println(treeMap);
    }

    public void Getallgoods() {
        List list = new ArrayList<Product>();
        list.add("Banana");
        list.add("Kiwi");
        list.add("Banana");
        list.add("Apple");
        list.add("Orange");
        list.add("Apple");
        list.add("Grape");
        System.out.println(list);
    }

    public void Deleteitem() {
        Set<String> set = new TreeSet();
        set.add(String.valueOf(12));
        set.add(String.valueOf(25));
        set.add(String.valueOf(12));
        set.add(String.valueOf(18));
        set.add(String.valueOf(13));
        set.add(String.valueOf(18));
        set.add(String.valueOf(30));
        System.out.println(set);
    }

    public void Edititem() {
        LinkedList<Product> linkedList = new LinkedList();
        linkedList.add(new Product(12, "Banana", 27));
        linkedList.add(new Product(25, "Kiwi", 20));
        linkedList.add(new Product(12, "Banana", 27));
        linkedList.add(new Product(18, "Apple", 35));
        linkedList.add(new Product(13, "Orange", 32));
        linkedList.add(new Product(18, "Apple", 35));
        linkedList.add(new Product(30, "Grape", 24));
        System.out.println(linkedList);
    }
}
