package lesson6;

/**
 * Создать массив типа String размером 3х6. И записать в него значения:
 * a1  a2  a3  a4  a5  a6
 * b1  b2  b3  b4  b5  b6
 * c1  c2   c3  c4  c5  c6
 * И распечатать.
 */

public class Massive3_6 {
    public static void main(String[] args) {
        String value[][] = new String[3][6];
        char b = 'a';
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                value[i][j] = b + "" + (j + 1) + " ";
                System.out.print(value[i][j]);
            }
            b++;
            System.out.println();
        }
    }
}
