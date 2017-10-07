package SumOfTwoNumbers;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("Введите два целых числа");
        Scanner scanner = new Scanner(System.in);
        int a, b;
        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
            b = scanner.nextInt ();
            System.out.println(a+b);
        }else {
            System.out.println("Вы ввели не целое число");
        }
    }
}
