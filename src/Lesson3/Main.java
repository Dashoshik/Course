package Lesson3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Необходимо ввести целое число");
        if (scan.hasNextInt()) {
            int num = scan.nextInt();
            if (0 < num && num < 10) {
                System.out.println("положительное число меньше 10");
            } else {
                System.out.println("Положительное число больше 10 или отрицательное");
            }
        }
    }
}