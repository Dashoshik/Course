package lesson13;

/**
 * Создайте объекты класса Double, используя все имеющиеся конструкторы.
 */
public class ObjectsDouble {
    public static void main(String[] args) {
        Double d1 = new Double(25.5);
        Double d2 = new Double("25.5");
        Double d3 = Double.valueOf(14.3);
        Double d4 = Double.valueOf("9.9");
        double d5 = Double.parseDouble("98.65");//Преобразовать значение типа String к типу double.Используем метод Double.parseDouble().
        double s1 = d1.byteValue();
        double s2 = d1.shortValue();
        double s3 = d1.floatValue();
        double s4 = d1.intValue();
        double s5 = d1.doubleValue();
        System.out.println(s1 + s2 + s3 + s4 + s5);
        System.out.println(d1);
        String d = Double.toString(3.14);
        System.out.println(d);
    }

}
