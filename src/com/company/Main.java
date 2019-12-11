package com.company;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LocalDateTime a = LocalDateTime.now();
        ArrayList<Cat> catsArray = new ArrayList<>();
        LinkedList<Cat> catsLinked = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            catsArray.add(new Cat("Pretty", 2));
            catsLinked.add(new Cat("Cutie Pie", 4));
        }
        for (int j = 0; j < 100; j++) {
            catsArray.add(500000, new Cat("Added Cat1", 5));
        }
        int time1 = LocalDateTime.now().getNano();
        for (int j = 0; j < 100; j++) {
            catsLinked.add(500000, new Cat("Added Cat2", 7));
        }
        int time2 = LocalDateTime.now().getNano();
        for (int j = 0; j < 100; j++) {
            catsArray.add(0, new Cat("First Cat1", 1));
            catsArray.add(1000000, new Cat("Last Cat1", 8));
        }
        int time3 = LocalDateTime.now().getNano();
        for (int j = 0; j < 100; j++) {
            catsLinked.addFirst(new Cat("First Cat2", 3));
            catsLinked.addLast(new Cat("Last Cat2", 8));
        }
        int time4 = LocalDateTime.now().getNano();
        catsArray.get(500000);
        catsArray.get(1000000);
        int time5 = LocalDateTime.now().getNano();
        catsLinked.get(500000);
        catsLinked.getLast();
        int time6 = LocalDateTime.now().getNano();
        catsArray.remove(500000);
        catsArray.remove(1000000);
        int time7 = LocalDateTime.now().getNano();
        catsLinked.remove(500000);
        catsLinked.removeLast();
        int time8 = LocalDateTime.now().getNano();
        int[] timeArray = {time1, time3, time5, time7};
        int[] timeLinked = {time2, time4, time6, time8};
        System.out.println(getFastList(timeArray, timeLinked));

    }

    static String getFastList(int[] num1, int[] num2) {
        for (int i : num1) {
            for (int j : num2) {
                if (i > j) {
                    return "Array faster";
                } else return "Linked faster";
            }
        }
        return " Error";
    }
}
