package lesson19;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Создайте HashMap, содержащий пары значений  - имя игрушки и объект игрушки (класс Toy).
 * Перебрать и распечатать пары значений - entrySet().
 * Перебрать и распечатать набор из имен игрушек  -keySet().
 * Перебрать и распечатать значения игрушек - values().
 * Для каждого перебора создать свой метод.
 */
public class ToyDemoMap {
    public static void main(String[] args) {
        Toy toy1 = new Toy("Doll", 34);
        Toy toy2 = new Toy("Car", 54);
        Toy toy3 = new Toy("Box", 64);
        Map<String, Toy> toys = new HashMap<>();
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
