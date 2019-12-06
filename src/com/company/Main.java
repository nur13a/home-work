package com.company;

public class Main {

    public static void main(String[] args) {
        Climbable koala=new Climbable() {
            @Override
            public void climb() {
                System.out.println("I'm Koala");
            }};
        Monkey monkey=new Monkey(koala );
    }
}

