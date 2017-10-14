package lesson10;

public class Apricot extends Fruit {
    String color;


    public Apricot(double weight, double price, String color) {
        super(weight, price);
        this.color = color;

    }

    public double priceOfFruit() {
        return 67.50;
    }
}
