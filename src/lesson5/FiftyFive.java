package lesson5;

/**
 * Распечатать 5 символов в одну строку начиная с ‘h’. Используем цикл for.
 */

public class FiftyFive {

    public static void main(String[] args) {
        char a = 'h';
        for (int i = 0; i < 5; i++) {
            System.out.print(a++);
        }
    }
}
