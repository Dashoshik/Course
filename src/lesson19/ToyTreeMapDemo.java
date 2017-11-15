package lesson19;

import java.util.*;

/**
 * Переделать предыдущее задание, используя TreeMap.
 */
public class ToyTreeMapDemo {
    public static void main(String[] args) {
        Toy toy1 = new Toy("Doll", 34);
        Toy toy2 = new Toy("Car", 54);
        Toy toy3 = new Toy("Box", 64);
        Map<String, Toy> toys = new TreeMap<>();
        toys.put(toy1.getName(), toy1);
        toys.put(toy2.getName(), toy2);
        toys.put(toy3.getName(), toy3);

        iterateEntries(toys);
        iterateKeys(toys);
        iterateValue(toys);
    }

    public static void iterateValue(Map<String, Toy> toys) {
        Collection<Toy> collection = toys.values();
        for (Toy value : collection) {
            System.out.println(value);
        }
    }

    public static void iterateKeys(Map<String, Toy> toys) {
        Set<String> set = toys.keySet();
        for (String key : set) {
            System.out.println("Ключ: " + key + ", ");
            System.out.println("Значение: " + toys.get(key));
        }
    }

    public static void iterateEntries(Map<String, Toy> toys) {
        Set<Map.Entry<String, Toy>> set = toys.entrySet();
        for (Map.Entry<String, Toy> entry : set) {
            System.out.println("Ключ: " + entry.getKey() + ", ");
            System.out.println("Значение: " + entry.getValue());
        }
    }
}
