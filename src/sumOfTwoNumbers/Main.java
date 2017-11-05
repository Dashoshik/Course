package sumOfTwoNumbers;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите два целых числа");
        Scanner scanner = new Scanner(System.in);
        int a = 0, b = 0;
        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
        } else {
            System.out.println("Вы ввели не целое число");
        }
        if (scanner.hasNextInt()) {
            b = scanner.nextInt();
            System.out.println(a + b);
        } else {
            System.out.println("Вы ввели не целое число");
        }
    }
}
