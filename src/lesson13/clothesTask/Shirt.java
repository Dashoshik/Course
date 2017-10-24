package lesson13.clothesTask;

public class Shirt extends Clothes implements ManClothes,WomanClothes {
    @Override
    public void toDressMan() {System.out.println("Одеваю футболку на мужчину");

    }

    @Override
    public void toDressWoman() {System.out.println("Одеваю футболку на женщину");

    }

    @Override
    public String toString() {
        return "Shirt{}";
    }
}
