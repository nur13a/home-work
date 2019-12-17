package com.company.task3;

public class Bag {
   private Cylinder cylinder;
   private Cirlce []cirlce;
   private Flat flat;

    public Bag(Cylinder cylinder, Cirlce[] cirlce, Flat flat) {
        this.cylinder = cylinder;
        this.cirlce = cirlce;
        this.flat = flat;
    }

    public Cylinder getCylinder() {
        return cylinder;
    }

    public void setCylinder(Cylinder cylinder) {
        this.cylinder = cylinder;
    }

    public Cirlce[] getCirlce() {
        return cirlce;
    }

    public void setCirlce(Cirlce[] cirlce) {
        this.cirlce = cirlce;
    }

    public Flat getFlat() {
        return flat;
    }

    public void setFlat(Flat flat) {
        this.flat = flat;
    }
}
