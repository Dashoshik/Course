package Lesson3;

public class NumberAsProgramInput {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        if (a % 2 != 0) {
            System.out.println(a);
        }
    }
}
