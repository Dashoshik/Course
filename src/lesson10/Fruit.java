package lesson10;

/**
 * Фруктовая лавка. Создать абстрактный класс Фрукт и классы Яблоко, Груша, Абрикос расширяющие его.
 * Класс Фрукт содержит
 * a) переменную вес,
 * б) завершенный метод printManufacturerInfo(){System.out.print("Made in Ukraine");}
 * в) метод, возвращающий стоимость фрукта, который должен быть переопределен в каждом
 * классе наследнике. Метод должен учитывать вес фрукта.
 * Создать несколько объектов разных классов. Подсчитать общую стоимость проданных фруктов.
 * А также общую стоимость отдельно проданных яблок, груш и абрикос.
 */
abstract public class Fruit {
    private double weight;
    private double price;

    public Fruit(double weight, double price) {
        this.weight = weight;
        this.price = price;
    }

    public Fruit() {
    }

    public void printManufacturerInfo(String origin) {
        System.out.println("Made in Ukraine");
    }

    public double priceOfFruit(double weight, double price) {
        //return double cost = this.weight * this.price;
        return 10.0;
    }
}
