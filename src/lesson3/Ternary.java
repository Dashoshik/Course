package lesson3;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите три числа");
        double a = 0.0, b = 0.0, c = 0.0;
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();
        double modulA = a < 0 ? -a : a;
        double modulB = b < 0 ? -b : b;
        double modulC = c < 0 ? -c : c;
        if (modulA < modulB && modulA < modulC) {
            System.out.println(modulA);
        } else if (modulB < modulA && modulB < modulC) {
            System.out.println(modulB);
        } else {
            System.out.println(modulC);
        }
    }
}

