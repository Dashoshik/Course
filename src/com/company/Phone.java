package com.company;

/**
 * Created by student on 01-Oct-17.
 */
public class Phone {
    long number;
    String model;
    double weight;

    Phone(long n, String m, double w) {
        this();
        number = n;
        model = m;
        weight = w;
    }

    Phone() {
        System.out.println("Описание телефона: ");
    }

    void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }
    void receiveCall (String f, long b){
        System.out.println("Звонит " + f + ",номер: "+b);
    }

    long getPhoneNumber() {
        return number;
    }
}