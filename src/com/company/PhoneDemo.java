package com.company;

/**
 * Created by student on 01-Oct-17.
 */
public class PhoneDemo {
    public static void main(String args[]) {
        Phone phonchik1 = new Phone(380503997423L, "Samsung", 10.2);
        Phone phonchik2 = new Phone(8098632523L, "Lenovo", 13);
        Phone phonchik3 = new Phone(8096854796L, "Nokia", 7);

        // phonchik1.number = 380503997423L;
        // phonchik1.model = "Samsung";
        //  phonchik1.weight = 10.2;
        System.out.println("Телефон №1 имеет следующие параметры: " + phonchik1.number + " " + phonchik1.model + " " + phonchik1.weight);
        phonchik1.receiveCall("Кто-то");
        System.out.println(phonchik1.getPhoneNumber());
        //phonchik2.number = 8098632523L;
        //phonchik2.model ="Lenovo";
        //phonchik2.weight =13;
        System.out.println("Телефон №2 имеет следующие параметры: " + phonchik2.number + " " + phonchik2.model + " " + phonchik2.weight);
        phonchik1.receiveCall("Somebody");
        System.out.println(phonchik2.getPhoneNumber());
        //phonchik3.number = 8096854796L;
        //phonchik3.model ="Nokia";
        //phonchik3.weight =7;
        System.out.println("Телефон №3 имеет следующие параметры: " + phonchik3.number + " " + phonchik3.model + " " + phonchik3.weight);
        phonchik1.receiveCall("Somebody");
        System.out.println(phonchik2.getPhoneNumber());
    }
}
