package com.company;

/**
 * Created by student on 01-Oct-17.
 */
public class PhoneDemo {
    public static void main(String args[]) {
        Phone phonchik1 = new Phone();
        Phone phonchik2 = new Phone();
        Phone phonchik3 = new Phone();

        phonchik1.number = 380503997423L;
        phonchik1.model = "Samsung";
        phonchik1.weight = 10.2;
        System.out.println("Телефон №1 имеет следующие параметры: " + phonchik1.number + " " + phonchik1.model + " " + phonchik1.weight);
        phonchik1.receiveCall("Кто-то");
        System.out.println(phonchik1.getPhoneNumber());
    }
}
