package lesson14;

/**
 * Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”.
 * Распечатать последний символ строки. Используем метод String.charAt().
 * Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
 * Проверить, начинается ли ваша строка подстрокой “i like”. Используем метод String. startsWith().
 * Найти позицию подстроки “Java” в строке “I like Java!!!”
 * Заменить все символы “а” на “о”.
 * Преобразуйте строку к верхнему регистру.
 * Преобразуйте строку к нижнему регистру.
 */
public class StringTask {
    public static void main(String[] args) {

        String s1 = "I like Java!!!";
        System.out.println(s1);
        print(s1);

    }

    public static void print(String s1) {
        System.out.println("в строке символов: " + (s1.length()));
        System.out.println(s1.charAt(s1.length() - 1));
        System.out.println(s1.endsWith("!!!"));
        String s2 = s1.toLowerCase();
        System.out.println(s2.startsWith("i like"));
        System.out.println(s1.lastIndexOf("Java", 13));
        System.out.println(s1.replace('a', 'o').replace('v', 'j'));
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.substring(7,11));
    }
}
