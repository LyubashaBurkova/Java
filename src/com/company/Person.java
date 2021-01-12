package com.company;

public class Person {
    public int height = 180;
    public String name = "Default";

    public void say (String name){
        System.out.println("Hello, " + name);
    }

    //конструктор 1
    public Person () {}
    //конструктор 2
    public Person (int h, String n) {
        height = h;
        name = n;
    }
    //конструктор 3
    public Person (String n){
        name = n;
    }
}
