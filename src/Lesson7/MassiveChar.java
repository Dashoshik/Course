package Lesson7;

/**
 * Создать двумерный массив типа char размером 4х2.
 * И записать туда значения с помощью блока для инициализации.
 * Распечатать значения массива с помощью метода Arrays.deepToString(m).
 */

import java.util.Arrays;

public class MassiveChar {
    public static void main(String[] args) {
        char name[][] = {
                {'4', 'a'},
                {'6', 's'},
                {'8', 'd'},
                {'8', 'w'},
                {'2', 'q'}
        };
        System.out.println(Arrays.deepToString(name));
    }
}
