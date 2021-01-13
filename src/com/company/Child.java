package com.company;

public class Child extends Person{
    public String kindergarden;
    public String parents;

    public Child (int height, String name,String kindergarden, String parents){
        super(height, name);
        this.kindergarden = kindergarden;
        this.parents = parents;
    }
}
