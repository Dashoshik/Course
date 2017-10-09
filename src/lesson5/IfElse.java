package lesson5;

/**
 * Передать на вход программы число От 1 до 7 в качестве аргумента.
 * Если число равно 1, выводим на консоль “Понедельник”, 2 –”Вторник” и т.д. Если 6 или 7 – “Выходной”.
 * Используем конструкцию if-else-if.
 */

public class IfElse {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        printDays(num);
    }

    public static void printDays(int num) {
        if (num == 1) {
            System.out.println("Понедельник");
        } else if (num == 2) {
            System.out.println("Вторник");
        } else if (num == 3) {
            System.out.println("Среда");
        } else if (num == 4) {
            System.out.println("Четверг");
        } else if (num == 5) {
            System.out.println("Пятница");
        } else if (num == 6 || num == 7) {
            System.out.println("Выходной");
        }
    }
}