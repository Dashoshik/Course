package lesson8;

public class MatrixDemo {
    public static void main(String[] args) {
        Matrix first = new Matrix(4, 2);
        Matrix second = new Matrix(4, 2);
        Matrix third = first.sum(second);

        first.show();
        System.out.println();
        second.show();
        System.out.println();
        third.show();
    }
}
