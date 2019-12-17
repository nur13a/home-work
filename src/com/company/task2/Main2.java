package com.company.task2;

import java.io.IOException;
import java.util.LinkedList;

public class Main2 {
    public static void main(String[] args) {
        LinkedList<Person> personLinkedList = new LinkedList<>();
        Person person = new Person("J", "N", "S");
        Person person2 = new Person("J", "N", "S");
        personLinkedList.add(person);
        try {
            personLinkedList.add(person2);
            if (personLinkedList.contains(person2)) {
                throw new Error();
            }
        } catch (ExceptionInInitializerError e) {
            System.out.println(e);
        }
    }
}
