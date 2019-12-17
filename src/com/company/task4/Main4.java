package com.company.task4;

import java.util.ArrayList;

public class Main4 {
    public static void main(String[] args) {
        ArrayList<Book>library=new ArrayList<>();
        for (int i=0;i<100;i++){
            library.add(new Book(i,"book",100+i,"jjoo"+i));
        }
    }
}
