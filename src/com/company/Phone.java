package com.company;

/**
 * Created by student on 01-Oct-17.
 */
public class Phone {
    private long number;
    private String model;
    private double weight;

    Phone(long n, String m, double w) {
        this();
        number = n;
        model = m;
        weight = w;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    Phone() {
        System.out.println("Описание телефона: ");
    }

    void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    void receiveCall(String f, long b) {
        System.out.println("Звонит " + f + ",номер: " + b);
    }

    long getPhoneNumber() {
        return number;
    }

    void sendMessage(long... array) {
        for (long num : array) {
            System.out.println("Message from " + num);
        }
    }
}