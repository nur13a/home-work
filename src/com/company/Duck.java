package com.company;

public class Duck implements Swimmable {
    private  final String duck="Duck";
    private int weight;
    private int averageAge;

    public Duck(int weight, int averageAge) {
        this.weight = weight;
        this.averageAge = averageAge;
    }

    public String getDuck() {
        return duck;
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
