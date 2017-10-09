package lesson5;

/**
 * Распечатать все числа от 1 до 100, которые делятся на 5 без остатка.
 */

public class DoWhile {
    public static void main(String[] args) {
        int n = 1;
        do {
            if (n % 5 == 0) {
                System.out.println(n);
            }
            n++;
        } while (n < 100);
    }
}
