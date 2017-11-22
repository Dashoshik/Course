package lesson10_Animals;

public class Horse extends Animal {
    String breed;


    private Halter halter;

    public Horse(String food, String location, String breed) {
        super(food, location);
        this.breed = breed;

    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Halter getHalter() {
        return halter;
    }

    public void setHalter(Halter halter) {
        this.halter = halter;
    }

    public void makeNoise() {
        System.out.println("стук копыт");
    }

    public void eat() {
        System.out.println("овес");
    }
}
