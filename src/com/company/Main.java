package com.company;

public class Main {

    public static void main(String[] args) {
//        Swimmable s = new Shark(550, 40);
//        Swimmable t = new Turtle(800, 70);
//        Swimmable d = new Duck(5, 3);
        Swimmable[] animals = {new Shark(550, 40), new Turtle(800, 70), new Duck(5, 3)};
        for (Swimmable animal : animals) {
            if (animal instanceof Shark && animal instanceof Turtle && animal instanceof Duck)
                if (((Shark) animal).getWeight() >= 400 && (((Turtle) animal).getWeight() >= 750) && (((Duck) animal).getWeight() >= 2)) {
                    System.out.println(((Shark) animal).getShark());
                    System.out.println(((Turtle) animal).getTurtle());
                    System.out.println(((Duck) animal).getDuck());
                }
        }
    }
}