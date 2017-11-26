package lesson17.goodsTask;

import java.util.*;

public class ShopDemo {
    public static void main(String[] args) {
        Category technika = new Category("Кухонная техника", new HashSet<Tovar>(Arrays.asList(
                new Tovar("Блендер", 1200.30, 7),
                new Tovar("Миксер", 780.50, 5),
                new Tovar("Тостер", 650.00, 6))));
        Category odezhda = new Category("Одежда", new HashSet<Tovar>(Arrays.asList(
                new Tovar("Джинсы", 1300.30, 10),
                new Tovar("Носки", 50.10, 9),
                new Tovar("Свитер", 750.20, 8))));
        Category cosmetics = new Category("Косметика", new HashSet<Tovar>(Arrays.asList(
                new Tovar("Помада", 330.40, 11),
                new Tovar("Тушь", 350.10, 12),
                new Tovar("Карандаш", 10.20, 1))));
        Comparator<Tovar> name = new Comparator<Tovar>() {
            @Override
            public int compare(Tovar o1, Tovar o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        Comparator<Tovar> price = new Comparator<Tovar>() {
            @Override
            public int compare(Tovar o1, Tovar o2) {
                return Double.compare(o1.getPrice(), o2.getPrice());
            }
        };
        Comparator<Tovar> rating = new Comparator<Tovar>() {
            @Override
            public int compare(Tovar o1, Tovar o2) {
                return Integer.compare(o1.getRating(), o2.getRating());
            }
        };
        System.out.println("Sorted by name ");
        printTovari(name, new Category[]{technika, odezhda, cosmetics});
        System.out.println("Sorted by price ");
        printTovari(price, new Category[]{technika, odezhda, cosmetics});
        System.out.println("Sorted by rating ");
        printTovari(rating, new Category[]{technika, odezhda, cosmetics});

    }

    public static void printTovari(Comparator<Tovar> c1, Category... c2) {
        Set<Tovar> sortedGoods = new TreeSet<>(c1);
        for (Category category : c2) {
            sortedGoods.addAll(category.getTovari());
        }
        for (Tovar t : sortedGoods) {
            System.out.println(t);
        }
    }
}
