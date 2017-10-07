package Lesson3;

/**
 * Имеется гирлянда, состоящая из 32 лампочек. Каждая лампочка имеет два состояния - включена или выключена. В начале работы программы случайным образом задайте какие лампочки будут включены. Напишите следующие методы:
 * a) метод который будет мигать лампочками гирлянды заданное количество раз (операция ~);
 * б) метод, который будет запускать гирлянду в режим бегущей строки (операция << или >>);
 * в) метод, который будет выяснять включена ли лампочки на первой позиции (наложение маски с помощью &);
 * г) метод который будет распечатывать текущее состояние гирлянды.
 * Используйте побитовые операции. Для получения двоичного формата числа используйте метод Integer.toBinaryString(a).
 */
public class Garland {
    public static void main(String[] args) {
        int a = 10;
        blink(10);
        move(7);
        status(a);
    }

    public static void blink(int a) {
        System.out.println(Integer.toBinaryString(a));
        a = ~a;
        System.out.print(a + " или");
        System.out.println(Integer.toBinaryString(a));
    }

    public static void move(int a) {
        a = a << 1;
        System.out.print(a + " или ");
        System.out.println(Integer.toBinaryString(a));
    }

    public static void status(int a) {
        a = a & 1;
        if (a == 1) {
            System.out.println("Включена");
        } else {
            System.out.println("Выключена");
        }

        System.out.println(Integer.toBinaryString(a));
    }

}


