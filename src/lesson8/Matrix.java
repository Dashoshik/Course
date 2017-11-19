package lesson8;

/**
 * Создать класс "Матрица". Класс должен иметь следующие поля:
 * 1) двумерный массив вещественных чисел;
 * 2) количество строк и столбцов в матрице.
 * Класс должен иметь следующие методы:
 * 1) сложение с другой матрицей;
 * 2) умножение на число;
 * 3) вывод на печать.
 */

public class Matrix {
    private double[][] mas;
    private int numStrok;
    private int numStolb;

    public Matrix(int numStrok, int numStolb) {
        this.mas = new double[numStrok][numStolb];

        for (int i = 0; i < numStrok; i++) {
            for (int j = 0; j < numStolb; j++) {
                mas[i][j] = Math.random();
            }
        }
        this.numStrok = numStrok;
        this.numStolb = numStolb;
    }

    public Matrix sum(Matrix second) {
        Matrix third = new Matrix(numStrok, numStolb);
        for (int i = 0; i < numStrok; i++) {
            for (int j = 0; j < numStolb; j++) {
                third.mas[i][j] = mas[i][j] + second.mas[i][j];
            }
        }
        return third;
    }

    public void show() {
        for (int i = 0; i < numStrok; i++) {
            for (int j = 0; j < numStolb; j++) {

                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
    }

}


