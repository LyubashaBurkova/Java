package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Person - объект
        Person vitya = new Person(120, "Vitya");
        //vitya.height = 160;
        vitya.say("George");
        System.out.println(vitya.name + "\'s height is " + vitya.height);

        Person vlad = new Person("Lusy");
        System.out.println(vlad.name + ' ' + vlad.height);

        Student freshman = new Student(200,"Gary", 1);
        System.out.println(freshman.name);
        System.out.println(freshman.height);
        System.out.println(freshman.course);

        Student man = new Student (160, "Vlad", 5);
        man.tell();

        Child smallBoy = new Child(100, "Max", "Sun", "Lora Mak");
        System.out.print(smallBoy.kindergarden);
    }
}
