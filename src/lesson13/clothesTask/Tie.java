package lesson13.clothesTask;

public class Tie extends Clothes implements ManClothes {
    @Override
    public void toDressMan() {System.out.println("Одеваю галстук на мужчину");

    }

    @Override
    public String toString() {
        return "Tie{}";
    }
}
