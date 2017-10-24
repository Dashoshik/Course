package lesson13.clothesTask;

public class Skirt extends Clothes implements WomanClothes {
    @Override
    public void toDressWoman() {System.out.println("Одеваю юбку на женщину");

    }

    @Override
    public String toString() {
        return "Skirt{}";
    }
}
