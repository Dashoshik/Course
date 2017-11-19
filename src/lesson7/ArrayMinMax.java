package lesson7;

/**
 * Создать двухмерный массив 5х8 и инициализировать его с помощью блока для инициализации.
 * Найти максимальное и минимальное значение в каждой "строке" и записать эти значения в двухмерный массив 5х2.
 * Распечатать оба массива.
 */

public class ArrayMinMax {
    public static void main(String[] args) {
        int name[][] = {
                {2, 3, 5, 5, 6, 99, 7, 6},
                {1, 10, 63, 789, 42, 36, 21, 85},
                {87, 53, 69, -14, 25, 1, 3, 8},
                {56, 98, 444, 23, 0, 47, 3, 7},
                {87, 63, 14, 58, 5, 9, 10, 3},
        };
        int minValue;
        int maxValue;
        int newArray[][] = new int[5][2];
        for (int i = 0; i < 5; i++) {
            minValue = name[i][0];
            maxValue = name[i][0];
            for (int j = 1; j < 8; j++) {
                if (name[i][j] < minValue) {
                    minValue = name[i][j];
                }
                if (name[i][j] > maxValue) {
                    maxValue = name[i][j];
                }
            }
            newArray[i][0] = minValue;
            newArray[i][1] = maxValue;
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(name[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(newArray[i][j]+ " ");
            }
            System.out.println();
        }
    }
}