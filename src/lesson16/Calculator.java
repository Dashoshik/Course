package lesson16;

public class Calculator {

    public static <T extends Number, V extends Number> double sum(T t, V v) {
        return t.doubleValue() + v.doubleValue();
        //System.out.println(t.doubleValue() + v.doubleValue());//метод doubleValue() есть у всех классов оболочек типа Number
    }

    public static <T extends Number, V extends Number> double multiply(T t, V v) {
        return t.doubleValue() * v.doubleValue();//метод doubleValue() есть у всех классов оболочек типа Number
    }

    public static <T extends Number, V extends Number> double divide(T t, V v) {
        return t.doubleValue() / v.doubleValue();//метод doubleValue() есть у всех классов оболочек типа Number
    }

    public static <T extends Number, V extends Number> double subtraction(T t, V v) {
        return t.doubleValue() - v.doubleValue();//метод doubleValue() есть у всех классов оболочек типа Number
    }

    public static void main(String[] args) {
        System.out.println(sum(10, 15.5));
        System.out.println(divide(2, 12.2));
        System.out.println(subtraction(5, 1));
        System.out.println(multiply(2, 2.5));
    }
}
