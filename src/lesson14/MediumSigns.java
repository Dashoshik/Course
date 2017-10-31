package lesson14;

/**
 * Даны строки разной длины (длина - четное число), необходимо вернуть ее два средних знака: "string" → "ri", "code" → "od", "Practice"→"ct".
 */
public class MediumSigns {
    public static void main(String[] args) {
        defineSigns("string");
        defineSigns("code");
        defineSigns("Practice");
    }

    static void defineSigns(String a) {
        StringBuilder info = new StringBuilder(a);
        int number = info.length() / 2;
        System.out.println(info.substring(number - 1, number + 1));
    }
}
