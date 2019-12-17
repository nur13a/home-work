package com.company.task4;

import java.util.Objects;

public class Book {
    private int year;
    private String title;
    private int price;
    private String code;

    public Book(int year, String title, int price, String code) {
        this.year = year;
        this.title = title;
        this.price = price;
        this.code = code;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "year=" + year +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", code='" + code + '\'' +
                '}';
    }
    public int getPriceWithSale(){
        return price/2;
    }
}
