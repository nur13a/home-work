package com.company;

public class Main {
    public static void main(String[] args) {
        DBeaver db = new DBeaver();
        db.addCity(new City(1, "Bishkek", 3000));
        db.addCity(new City(2, "Moscow", 30000));

        db.cityUpdate(new City(2,"London",50000));

    }
}
