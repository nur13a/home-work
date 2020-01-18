package com.company;

public class Monkey implements Climbable {
    Climbable climbable;

    public Monkey(Climbable climbable) {
        this.climbable = climbable;
    }

    public Climbable getClimbable() {
        return climbable;
    }

    public void setClimbable(Climbable climbable) {
       this.climbable=climbable;
    }

    public void eatFruit() {
        System.out.println("Bananas");
    }

    @Override
    public void climb() {
        System.out.println("climb");
    }
}

interface Climbable {
    void climb();
}

interface Eatable {
    void eat();
}

abstract class AbstractFruit implements Eatable {
    public void eatFruit() {
        System.out.println("fruit");
    }
}