package Lesson5;

/**
 * Передать на вход программы число От 1 до 7 в качестве аргумента.
 * Если число равно 1, выводим на консоль “Понедельник”,
 * 2 –”Вторник” и т.д.
 * Если 6 или 7 – “Выходной”.
 */

public class SwitchTask {
    public static void main(String[] args) {
        printNames(args);
    }

    public static void printNames(String[] args) {
        switch (args[0]) {
            case "1":
                System.out.println("Понедельник");
                break;
            case "2":
                System.out.println("Вторник");
                break;
            case "3":
                System.out.println("Среда");
                break;
            case "4":
                System.out.println("Четверг");
                break;
            case "5":
                System.out.println("Пятница");
                break;
            default:
                System.out.println("Выходной");
        }
    }
}


