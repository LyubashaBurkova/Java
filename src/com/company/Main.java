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
        System.out.print(vlad.name + ' ' + vlad.height);
    }
}
