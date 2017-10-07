package com.company;

/**
 * Создать класс Circle, который содержит
 * - переменную radius;
 * - методы, вычисляющие площадь и длину окружности;
 * Создать несколько объектов данного класса.
 */


public class Circle {
    double radius;
    double pi;

    void square() {
        System.out.println("Площадь равна " + (pi * radius * radius));
    }

    void length() {
        System.out.println("Длина окружности равна " + (2 * pi * radius));
    }


    Circle(double r, double pi) {
        radius = r;
        pi = pi;
    }

    public static void main(String[] args) {
        Circle krug1 = new Circle(10.2, 3.14);
        Circle krug2 = new Circle(4.96, 3.14);
        krug1.square();
        krug2.length();
    }
}
