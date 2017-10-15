package lesson10_Animals;

public class Cat extends Animal {
    String fluffy;

    public Cat(String food, String location, String fluffy) {
        super(food, location);
        this.fluffy = fluffy;

    }

    public String getFluffy() {
        return fluffy;
    }

    public void setFluffy(String fluffy) {
        this.fluffy = fluffy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Cat cat = (Cat) o;

        return !(fluffy != null ? !fluffy.equals(cat.fluffy) : cat.fluffy != null);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (fluffy != null ? fluffy.hashCode() : 0);
        return result;
    }

    public void makeNoise() {
        System.out.println("Мяу");
    }

    public void eat() {
        System.out.println("молоко");
    }
}
