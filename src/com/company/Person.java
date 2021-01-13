package com.company;

public class Person {
    public static int height = 180;
    public String name = "Default";

    //если метод static то к нему можно обратиться не создавая объектк,
    // но при этом если мы внесем изменения, то они повлияут на сам метод
    public void say1 (String name){
        System.out.println("Hello, " + name);
    }

    public static String say2 (String name){
        System.out.println("Hello, " + name);
        return name;
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
