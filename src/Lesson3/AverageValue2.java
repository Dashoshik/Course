package Lesson3;

public class AverageValue2 {
    public static void main(String[] args) {
        double sum = 0;
        int length = 0;
        for (String str : args) {
            double d = Double.parseDouble(str);
            sum += d;
            length++;
        }
        if (length != 0) {
            System.out.println(sum / length);
        } else {
            System.out.println("Числа не введены");
        }
    }

}
