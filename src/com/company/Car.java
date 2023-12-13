package com.company;

public class Car extends Vehicle implements Comparable<Car>{
    String marka, model;
    int godina;

    Car() {
        this.marka = "";
        this.model = "";
        this.godina = 0;
    }

    Car(String marka, String model, int godina) {
        this.marka = marka;
        this.model = model;
        this.godina = godina;
    }

    @Override
    public void drive() {
        System.out.println("Prevoznoto sredstvo se dviji");
    }

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", godina=" + godina +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        if(this.getGodina()>o.getGodina()) return 1;
        else if (this.getGodina()<o.getGodina()) return -1;
        else return 0;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }
}
