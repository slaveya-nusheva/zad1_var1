package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>(4);

        Car c1 = new Car();
        c1.setGodina(2020);
        c1.setMarka("Volvo");
        c1.setModel("Ranger");
        cars.add(c1);

        Car c2 = new Car();
        c2.setGodina(1999);
        c2.setMarka("Ford");
        c2.setModel("Mondeo");
        cars.add(c2);

        Car c3 = new Car();
        c3.setGodina(2008);
        c3.setMarka("Porche");
        c3.setModel("911");
        cars.add(c3);

        Car c4 = new Car();
        c4.setGodina(2015);
        c4.setMarka("Opel");
        c4.setModel("Astra");
        cars.add(c4);

        Collections.sort(cars);

        for(Car curr : cars){
            System.out.println(curr.toString());
        }
    }
}
