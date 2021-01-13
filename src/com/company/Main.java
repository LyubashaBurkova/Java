package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* Person vitya = new Person(120, "Vitya");
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
        System.out.print(smallBoy.kindergarden);*/

       /* Shape[] arr = new Shape []{new Circle(), new Square(), new Triangle()};
        for (int i = 0; i < arr.length; i++){
            arr[i].draw();
        }*/

        /*Computer comp = new Computer();
        comp.i7.start();
        comp.i7.shutdown();
        comp.transfer.start();*/

       /* new Computer(){
            void superComp (){
                this.i7.shutdown();
                this.transfer.start();
            }
        };*/

        Shape circle = new Circle();
        circle.draw();
    }
}
