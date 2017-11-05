package lesson3;
/**
 * Создать программу, которая будет выводить на экран меньшее по модулю из трёх введённых пользователем вещественных чисел.
 * Для вычисления модуля используйте тернарную условную операцию.
 */

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите три числа");
        double a = 0.0, b = 0.0, c = 0.0;
        if (scan.hasNextDouble()) {
            a = scan.nextDouble();
            a = a < 0 ? -a : a;
        }
        if (scan.hasNextDouble()) {
            b = scan.nextDouble();
            b = b < 0 ? -b : b;
        }
        if (scan.hasNextDouble()) {
            c = scan.nextDouble();
            c = c < 0 ? -c : c;
        }
        if (a < b && a < c) {
            System.out.println(a);
        } else if (b < a && b < c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}

