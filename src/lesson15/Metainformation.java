package lesson15;

import lesson15.foodTask.Food;

import java.io.Serializable;

public class Metainformation {
    public static void main(String[] args) {
        info(Serializable.class);
        info(new Food().getClass());
        info(double.class);
        info(new Exception().getClass());
    }

    private static void info(Class arrayClass) {
        System.out.println("Class name "+arrayClass.getName());
        System.out.println("Is Array? " + arrayClass.isArray());
        System.out.println("Is Interface? " + arrayClass.isInterface());
        System.out.println("Is Primitive? " + arrayClass.isPrimitive());
        System.out.println();
    }

}
