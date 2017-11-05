package lesson16.generics;

import lesson10_Animals.Animal;

import java.io.Serializable;

/**
 * Создать обобщенный класс с тремя параметрами (T, V, K).
 * Класс содержит три переменные типа (T, V, K).
 * Класс содержит конструктор, принимающий на вход параметры типа (T, V, K).
 * Класс содержит методы возвращающие значения трех переменных.
 * Создать метод, выводящий на консоль имена классов для трех переменных класса.
 * Наложить ограничения на параметры типа:
 * T должен реализовать интерфейс Comparable,
 * V должен реализовать интерфейс Serializable и расширять класс Animal,
 * K должен расширять класс Number.
 */
public class Generics<T extends Comparable, V extends Animal & Serializable, K extends Number> {
    private T t1;
    private V v1;
    private K k1;

    public Generics(T t1, V v1, K k1) {
        this.t1 = t1;
        this.v1 = v1;
        this.k1 = k1;
    }

    public T getT1() {
        return t1;
    }

    public void setT1(T t1) {
        this.t1 = t1;
    }

    public V getV1() {
        return v1;
    }

    public void setV1(V v1) {
        this.v1 = v1;
    }

    public K getK1() {
        return k1;
    }

    public void setK1(K k1) {
        this.k1 = k1;
    }

    public void getNameClass() {
        System.out.println(t1.getClass().getName());
        System.out.println(v1.getClass().getName());
        System.out.println(k1.getClass().getName());
    }
}
