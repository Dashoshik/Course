package lesson7;

import java.util.Arrays;

/**
 * Изменить программу сортировки пузырьком:
 * добавить возможность досрочного окончания сортировки;
 */

public class BreakCycle {
    public static void main(String[] args) {
        int[] newMassive = {9, 3, 4, 5, 0};
        System.out.println(Arrays.toString(newMassive));
        sort(newMassive);
        System.out.println(Arrays.toString(newMassive));
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean anotherResult = false;
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                    anotherResult = true;
                }
            }
            if (!anotherResult) {
                break;
            }
        }

    }
}

