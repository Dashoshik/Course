package lesson14;

/**
 * а) Дано два числа, например 3 и 56, необходимо составить следующие строки:
 * 3 + 56 = 59
 * 3 – 56 = -53
 * 3 * 56 = 168.
 * Используем метод StringBuilder.append().
 */

public class StringBuilderTask {
    public static void main(String[] args) {
        int a = 3;
        int b = 56;
        StringBuilder text1 = new StringBuilder();
        StringBuilder text2 = new StringBuilder();
        StringBuilder text3 = new StringBuilder();

        text1.append(a).append("+").append(b).append("=").append(a + b);
        System.out.println(text1);
        text2.append(a).append("-").append(b).append("=").append(a - b);
        System.out.println(text2);
        text3.append(a).append("*").append(b).append("=").append(a * b);
        System.out.println(text3);
    }
}
