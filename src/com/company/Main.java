package com.company;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random r = new Random();
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(2);
            arrayList.add(r.nextInt(2));
            linkedList.add(r.nextInt(2));
        }
        bubbleSort(array);
        bubbleSort(arrayList);
        bubbleSort(linkedList);
    }

    public static void bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = 0; j < arr.size() - 1; j++)
                if (arr.get(j) > arr.get(j + 1)) {
                    int tmp = arr.get(j);
                    arr.set(arr.get(j), arr.get(j + 1));
                    arr.set((j + 1), tmp);
                }
        }
        System.out.println(arr);
    }public static void bubbleSort(LinkedList<Integer> arr) {
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = 0; j < arr.size() - 1; j++)
                if (arr.get(j) > arr.get(j + 1)) {
                    int tmp = arr.get(j);
                    arr.set(arr.get(j), arr.get(j + 1));
                    arr.set((j + 1), tmp);
                }
        }
        System.out.println(arr);
    }
}