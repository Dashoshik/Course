package lesson15;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by student on 29.10.2017.Создать properties файлы на русском и английским,
 *содержащие названия изученных тем по Java.
 *Создать метод, который получает в качестве параметра локаль и распечатывает всю информацию из properties файла.
 *Используем метод ResourceBundle.keySet().*/
public class TaskLocale {
    public static void main(String[] args) throws UnsupportedEncodingException {
        print("", "");

        print("en", "US");
    }
    private static void print(String language, String country) throws UnsupportedEncodingException {
        Locale current = new Locale(language, country);
        ResourceBundle rb = ResourceBundle.getBundle("taskName", current);
        for (String key : rb.keySet()) {
            String value = rb.getString(key);
            value = new String(value.getBytes("ISO-8859-1"), "UTF-8");
            System.out.println(value);
        }
        System.out.println();
    }
}
