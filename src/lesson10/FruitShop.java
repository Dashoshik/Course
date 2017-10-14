package lesson10;

public class FruitShop {
    public static void main(String[] args) {
        Apple appleRed = new Apple(2.0, 17.50, "круглый");
        Pear pearYellow = new Pear(1.0, 35.20, "sweet");
        Apricot apricotBig = new Apricot(0.5, 67.50, "yellow");
        Fruit[] allFruits = new Fruit[3];
        allFruits[0] = appleRed;
        allFruits[1] = pearYellow;
        allFruits[2] = apricotBig;

        for (Fruit fruktik : allFruits) {
            fruktik.printManufacturerInfo();
            System.out.println(fruktik.priceOfFruit());
        }
    }
}
