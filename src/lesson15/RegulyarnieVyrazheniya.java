package lesson15;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Дана строка “Versions: Java  5, Java 6, Java   7, Java 8.”
 * Найти все подстроки “Java X”и распечатать их.
 */
public class RegulyarnieVyrazheniya {
    public static void main(String[] args) {
        String str = "Versions: Java  5, Java 6, Java   7, Java 8.";
        Pattern p = Pattern.compile("Java\\s+\\d");
        Matcher matcher = p.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

