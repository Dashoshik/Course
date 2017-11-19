package lesson16;

public class Calculator {

    public static <T extends Number, V extends Number> void sum(T t, V v) {
        System.out.println(t.doubleValue() + v.doubleValue());//метод doubleValue() есть у всех классов оболочек типа Number
    }

    public static <T extends Number, V extends Number> void multiply(T t, V v) {
        System.out.println(t.doubleValue() * v.doubleValue());//метод doubleValue() есть у всех классов оболочек типа Number
    }

    public static <T extends Number, V extends Number> void divide(T t, V v) {
        System.out.println(t.doubleValue() / v.doubleValue());//метод doubleValue() есть у всех классов оболочек типа Number
    }

    public static <T extends Number, V extends Number> void subtraction(T t, V v) {
        System.out.println(t.doubleValue() - v.doubleValue());//метод doubleValue() есть у всех классов оболочек типа Number
    }

    public static void main(String[] args) {
        sum(10, 15.5);
        divide(2, 12.2);
        subtraction(5, 1);
        multiply(2, 2.5);
    }
}
