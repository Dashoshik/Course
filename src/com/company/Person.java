package com.company;

public class Person {
    String fullName;
    int age;

    void move() {
        System.out.println(fullName + " is moving");
    }

    void talk() {
        System.out.println("it's age of person " + age);
    }

    Person(String n, int a) {
        fullName = n;
        age = a;
    }

    Person() {
    }


    public static void main(String[] args) {
        Person boy = new Person();
        Person girl = new Person("Kate", 30);
        boy.talk();
        girl.move();
    }
}

