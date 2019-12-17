package com.company.task1;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                hashSet.add(i);
            }
        }
    }

    public static void add(HashSet hashSet) {
        for (int i = 0; i < hashSet.size(); i++) {
            if (i % 5 == 0) {
                hashSet.add(i);
            } else hashSet.add(i);

        }
    }
}
