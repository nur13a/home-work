package com.company;

public class Turtle implements Swimmable {
    private  final String turtle="Turtle";
    private int weight;
    private int averageAge;

    public Turtle(int weight, int averageAge) {
        this.weight = weight;
        this.averageAge = averageAge;
    }

    public String getTurtle() {
        return turtle;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAverageAge() {
        return averageAge;
    }

    public void setAverageAge(int averageAge) {
        this.averageAge = averageAge;
    }

    @Override
    public void swim() {
        System.out.println("Swim");
    }

    @Override
    public void voice() {
        System.out.println("voice");
    }

}
