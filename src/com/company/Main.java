package com.company;

public class Main {
    public static void main(String[] args) {
        User u=new User(1,"login","email","password");
        DBeaver db=new DBeaver();
        db.registerWithCode(u);
       db.authorize("login","password",u);
        }
}
