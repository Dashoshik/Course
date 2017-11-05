package lesson16.generics;

import lesson10_Animals.Dog;

/**
 * Created by student on 05.11.2017.
 */
public class GenericsDemo {
    public static void main(String[] args) {
        Generics<Character, Dog, Integer> nameObject = new Generics<>('k', new Dog("korm", "Kharkov", "Da"), 25);
        nameObject.getNameClass();
    }

}
