package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String headName = sc.nextLine();
        Country country = new Country();
        country.findHead(headName);
    }
}

class Country {
    District[] districts1 = {new District("D", "Leninskii"), new District("E", "Oktyabrskii")};
    District[] districts2 = {new District("F", "Sverdlovskii"), new District("J", "Chuiskii")};
    District[] districts3 = {new District("K", "Noyabrskii"), new District("L", "Decabrskii")};

    City[] cities = {new City("A", "Bishkek", districts1), new City("B", "Astana", districts2), new City("C", "Moscow", districts3)};
    Village[] village = {new Village("G", "Village1"), new Village("M", "Village2")};

    public void findHead(String headName) {
        for (City c : cities) {
            if (c.getHead().contains(headName)) System.out.println(headName+" "+c.getTitle());
        }
        for (Village v : village
        ) {
            if (v.getHead().contains(headName)){ System.out.println(headName+" "+v.getTitle());
            }
        }
        for (District d1 : districts1
        ) {
            if (d1.getHead().contains(headName)) System.out.println(headName+" "+d1.getTitleOfDistrict());

        }for (District d2 : districts2
        ) {
            if (d2.getHead().contains(headName)) System.out.println(headName+" "+d2.getTitleOfDistrict());

        }for (District d3 : districts3
        ) {
            if (d3.getHead().contains(headName)) System.out.println(headName+" "+d3.getTitleOfDistrict());
        }
    }
}


abstract class AbstractLocality {
    private String head;

    public AbstractLocality(String head) {
        this.head = head;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }
}

class City extends AbstractLocality {
    private String title;
    private District[] districts;

    public City(String head, String title, District[] distrtts) {
        super(head);
        this.title = title;
        this.districts = districts;
    }

    public District[] getDistricts() {
        return districts;
    }

    public void setDistricts(District[] districts) {
        this.districts = districts;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String findHead(City[] city, District[] districts, String headName) {
        for (City c : city) {
            if (c.getHead().equals(headName)) return getHead();
            else {
                for (District d : districts
                ) {
                    if (d.getHead().equals(headName)) return getHead();
                    else break;
                }
            }
        }
        return getHead();
    }
}

class District extends AbstractLocality {
    String titleOfDistrict;

    public District(String head, String titleOfDistrict) {
        super(head);
        this.titleOfDistrict = titleOfDistrict;
    }

    public String getTitleOfDistrict() {
        return titleOfDistrict;
    }

    public void setTitleOfDistrict(String titleOfDistrict) {
        this.titleOfDistrict = titleOfDistrict;
    }
}

class Village extends AbstractLocality {
    private String title;

    public Village(String head, String title) {
        super(head);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}