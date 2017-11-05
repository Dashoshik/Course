package lesson14;

/**
 * а) Дано два числа, например 3 и 56, необходимо составить следующие строки:
 * 3 + 56 = 59
 * 3 – 56 = -53
 * 3 * 56 = 168.
 * Используем метод StringBuilder.append().
 * б) Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(), StringBuilder.deleteCharAt().
 * в) Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace(). (Задание с урока).
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
        text3.insert(4, "равно ");
        text3.deleteCharAt(10);
        System.out.println(text3);
        text2.replace(5, 5, " равно");
        text2.deleteCharAt(4);
        System.out.println(text2);
    }
}
