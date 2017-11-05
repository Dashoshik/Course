package lesson17;

import lesson10.Apple;
import lesson10.Fruit;

import java.util.ArrayList;
import java.util.List;

/**
 * Создать динамический массив, содержащий объекты класса. Раcпечатать его содержимое, используя for each.
 */
public class DynamicArray {
    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple(1.2, 10.3, "shape"));
        apples.add(new Apple(0.5, 7.42, "shape"));
        apples.add(new Apple(2.5, 21.65, "shape"));
        for (Apple a : apples) {
            System.out.println(a);
        }
    }
}
