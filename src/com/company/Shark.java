package com.company;

public class Shark implements Swimmable {
    private  final String shark="Shark";
    private int weight;
    private int averageAge;
    public Shark(){}
    public Shark(int weight, int averageAge) {
        this.weight = weight;
        this.averageAge = averageAge;
    }

    public  String getShark() {
        return shark;
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

    public void eat() {
        System.out.println("eat");
    }
    public void hunt(){}
}
