package lesson20;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Переписать класс FileCopy: Добавить блок try-with-resources.
 * Убрать throws IOException из объявления main() метода. И добавить соответствующий catch блок.
 */
public class FileCopy {
    public static void main(String args[]) {
        try (FileInputStream fileIn = new FileInputStream("src\\lesson20\\Dasha.txt");
             FileOutputStream fileOut = new FileOutputStream("src\\lesson20\\copied_file_Dasha2.txt")) {
            int a;
            // Копирование содержимого файла file.txt
            while ((a = fileIn.read()) != -1) {
                fileOut.write(a);// Чтение содержимого файла file.txt и запись в файл copied_file.txt
            }
        } catch (IOException e) {
            e.getMessage();
        }
    }
}

