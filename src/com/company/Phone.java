package com.company;

/**
 * Created by student on 01-Oct-17.
 */
public class Phone {
    private long number;
    private String model;
    private double weight;
    private static int count = 0;

    Phone(long n, String m, double w) {
        this();
        number = n;
        model = m;
        weight = w;
    }
   public Phone() {
        System.out.println("Описание телефона: ");
       count++;
    }

    public Phone(String model) {
        this.model = model;
        count++;
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



   public static int getCountPhone() {
        return count;
    }
}