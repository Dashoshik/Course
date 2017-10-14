package lesson10;

public class Apple extends Fruit {
    String shape;


    public Apple(double weight, double price, String shape) {
        super(weight, price);
        this.shape = shape;

    }

    public double priceOfFruit() {
        return 15.0;
    }
}