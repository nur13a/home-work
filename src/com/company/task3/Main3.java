package com.company.task3;

public class Main3 {
    public static void main(String[] args) {
        Cylinder cola=new Cola();
        Cirlce[]apples=new Apple[20];
        Flat book=new Book();
        Bag bag1=new Bag(cola,apples,book);
        Cylinder water=new Bottle();
        Cirlce[] ball=new Ball[50];
        Flat doc=new Doc();
        Bag bag2=new Bag(water,ball,doc);
        Cirlce[]applesBalls={new Apple(),new Ball()};
        Bag bag3=new Bag(cola,applesBalls,doc);


    }
}
