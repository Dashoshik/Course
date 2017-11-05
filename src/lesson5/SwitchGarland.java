package lesson5;

/**
 * Переписать гирлянду используя оператор switch для  выбора  нужной операции.
 * Имеется гирлянда, состоящая из 32 лампочек. Каждая лампочка имеет два состояния - включена или выключена. В начале работы программы
 * случайным образом задайте какие лампочки будут включены. Напишите следующие методы:
 * a) метод который будет мигать лампочками гирлянды заданное количество раз (операция ~);
 * б) метод, который будет запускать гирлянду в режим бегущей строки (операция << или >>);
 * в) метод, который будет выяснять включена ли лампочки на первой позиции (наложение маски с помощью &);
 * г) метод который будет распечатывать текущее состояние гирлянды.
 * Используйте побитовые операции. Для получения двоичного формата числа используйте метод Integer.toBinaryString(a).
 * Переписать гирлянду используя оператор switch для  выбора  нужной операции.
 */
public class SwitchGarland {
    private static int lamp = 145665;

    public static void main(String[] args) {
        System.out.printf("%32s%n", Integer.toBinaryString(lamp));
        operation(1);
        operation(2);
        operation(3);
        operation(4);
    }

    public static void operation(int a) {
        switch (a) {
            case 1:
                invert();
                break;
            case 2:
                moveRight(4);
                break;
            case 3:
                moveLeft(5);
                break;
            case 4:
                checkLight();
                break;
        }
    }

    private static void checkLight() {
        int check = 1;
        int result = lamp & check;
        System.out.print("Лампа включена? ");
        System.out.println(result == 1);
    }

    private static void moveLeft(int moves) {
        System.out.println("to left");
        for (int i = 0; i < moves; i++) {
            lamp <<= 1;
            System.out.println(Integer.toBinaryString(lamp));
        }
        System.out.println();
    }

    private static void moveRight(int moves) {
        System.out.println("to right");
        for (int i = 0; i < moves; i++) {
            lamp >>= 1;
            System.out.println(Integer.toBinaryString(lamp));
        }
        System.out.println();

    }

    private static void invert() {
        System.out.println("invert");
        lamp = ~lamp;
        System.out.printf("%32s%n", Integer.toBinaryString(lamp));
        System.out.println();
    }
}
