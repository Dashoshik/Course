package com.company;

/**
 * Created by UITS-Admin on 11.10.2017.
 */
public class StudentAspirantDemo {
    public static void main(String[] args) {
        Student studentik1 = new Student("Masha", "Ivanova", "NT-8");
        Aspirant aspirantische1 = new Aspirant("Adelina", "Karlson", "OO-12", "Influence to system");
        System.out.println("Information about student " + studentik1.lastName);

        System.out.println("Information about aspirant " + aspirantische1.firstName);


    }
}
