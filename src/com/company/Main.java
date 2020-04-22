package com.company;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set <Dog>dogs=new HashSet<>();
        for (int i=0;i<40;i++) {
            dogs.add(new Dog(i,i+""));
        }
        System.out.println(dogs);
    }
}
class Dog{
    private int age;
    private String name;

    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age &&
                name.equals(dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Override
    public String toString() {
        return "Dalmatian " +
                "age=" + age +
                ", name=" + name +"\n";
    }
}