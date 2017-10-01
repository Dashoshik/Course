package com.company;

/**
 * Created by student on 01-Oct-17.
 */
public class Phone {
    long number;
    String model;
    double weight;

    Phone(long n, String m, double w) {
        number = n;
        model = m;
        weight = w;
    }

    void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    long getPhoneNumber() {
        return number;
    }
}