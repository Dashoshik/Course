package lesson5;

import java.util.Scanner;

/**
 * Реализовать подсчет факториала используя цикл for.
 * n! = 1*2*...*n;​
 * 0!=1;
 * 5! = 1*2*3*4*5;
 */
public class Faktorial {
    public static void main(String[] args) {
        int n = 0;
        int result = 1;
        System.out.println("введите число, факториал которого необходимо найти");
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextInt()) {
            n = scan.nextInt();
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            System.out.println("Результат равен " + result);
        }
    }
}
