package com.company;

/**
 * Created by UITS-Admin on 11.10.2017.
 */
public class StudentAspirantDemo {
    public static void main(String[] args) {
        Student studentik1 = new Student("Masha", "Ivanova", "NT-8");
        Aspirant aspirantische1 = new Aspirant("Adelina", "Karlson", "OO-12", "Influence to system");
        Student aspirantische333 = new Aspirant("Vlad", "Petrov", "op65", "Классификация чего-то");

        System.out.println("Information about student " + studentik1.getLastName());

        System.out.println("Information about aspirant " + aspirantische1.getFirstName());

        System.out.println("Information about Аспирант типа Студент - " + aspirantische333.getFirstName());
        Student[] studentsAndAspirants = new Student[3];
        studentsAndAspirants[0] = studentik1;
        studentsAndAspirants[1] = aspirantische1;
        studentsAndAspirants[2] = aspirantische333;

        for (Student pupil : studentsAndAspirants) {
            System.out.println(pupil.getScholarship());
        }
        System.out.println(studentik1);
        System.out.println(aspirantische1.equals(aspirantische333));

    }
}
