package lesson10_Animals;

public class Cat extends Animal {
    String fluffy;

    public Cat(String food, String location, String fluffy) {
        super(food, location);
        this.fluffy = fluffy;

    }

    public void makeNoise() {
        System.out.println("Мяу");
    }

    public void eat() {
        System.out.println("молоко");
    }
}
