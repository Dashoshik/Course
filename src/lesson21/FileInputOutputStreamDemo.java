package lesson21;

import java.io.*;

/**
 * Переписать класс FileInputOutputStreamDemo:
 * a) Добавить блок try-with-resources.
 * б) Замените for (int i = 0; i < c.length; i++) на блок for-each.
 * в) Пусть a.txt записывается в каталог src/io.
 */
public class FileInputOutputStreamDemo {
    public static void main(String args[]) {
        try (OutputStream output = new FileOutputStream("src/lesson21/a.txt");
             InputStream input = new FileInputStream("src/lesson21/a.txt");) {
            char c[] = {'a', 'b', 'c'};
            for (char eachOne : c) {
                output.write(eachOne); // Запись каждого символа в текстовый файл
            }
            int size = input.available();
            for (int j = 0; j < size; j++) {
                System.out.print((char) input.read() + " "); // Чтение текстового файла посимвольно
            }
        } catch (IOException e) {
            System.out.print("Exception");
        }
    }
}
