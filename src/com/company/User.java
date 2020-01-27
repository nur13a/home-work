package com.company;

import java.sql.Timestamp;

public class User {
    private int ID;
    private String login;
    private String email;
    private String password;
    private Timestamp timestamp;
   private static String code;

    public User() {
    }

    public User(int ID, String login, String email, String password) {
        this.ID = ID;
        this.login = login;
        this.email = email;
        this.password = password;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public String Coding() {
        code = new StringBuffer(password).reverse().toString() + password.charAt(0);
        return code;
    }

    public static String removeSymbol(String s, int position) {
        return s.substring(0, position) + s.substring(position + 1);
    }
    public String getPassword() {
        String s1 = new StringBuffer(code).reverse().toString();
        s1=removeSymbol(s1,1);
        return s1;
    }
    public String UnCoding() {
        String s1 = new StringBuffer(code).reverse().toString();
        s1=removeSymbol(s1,1);
        return s1;
    }
}
