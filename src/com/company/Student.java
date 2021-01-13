package com.company;

public class Student extends Person {
    int course = 1;

    public Student (int height, String name, int course){
        super(height,name);
        this.course = course;
    }

    void tell(){
        //в дочернем элементе мы не можем обратиться Person.name
        //обращаемся через supper, который содержит все поля и методы
        //supper обращение к основному классу
        System.out.println(super.name);
        System.out.println(super.height);
        System.out.println(course);
    }
}
