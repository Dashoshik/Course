package lesson13.clothesTask;

public class Pants extends Clothes implements WomanClothes, ManClothes {
    @Override
    public void toDressMan() {
        System.out.println("Одеваю штаны на мужчину");

    }

    @Override
    public void toDressWoman() {
        System.out.println("Одеваю штаны на женщину");

    }

    @Override
    public String toString() {
        return "Pants{}";
    }
}
