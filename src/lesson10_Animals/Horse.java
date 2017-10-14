package lesson10_Animals;

public class Horse extends Animal {
    String breed;

    public Horse(String food, String location, String breed) {
        super(food, location);
        this.breed = breed;

    }

    public void makeNoise() {
        System.out.println("стук копыт");
    }

    public void eat() {
        System.out.println("овес");
    }
}
