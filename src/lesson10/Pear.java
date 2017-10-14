package lesson10;

public class Pear extends Fruit {
    String taste;


    public Pear(double weight, double price, String taste) {
        super(weight, price);
        this.taste = taste;

    }

    public double priceOfFruit() {
        return 20.0;
    }
}

