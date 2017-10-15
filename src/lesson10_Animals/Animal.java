package lesson10_Animals;

/**
 * Создать класс Animal и расширяющие его классы Dog, Cat, Horse.
 * Класс Animal содержит переменные food, location и методы makeNoise, eat, sleep.
 * Dog, Cat, Horse переопределяют методы makeNoise, eat.
 * Добавьте переменные в классы Dog, Cat, Horse, характеризующие только этих животных.
 * Создайте класс Ветеринар, в котором определите метод void treatAnimal(Animal animal).
 * Пусть этот метод распечатывает food и location пришедшего на прием животного.
 * В методе main создайте массив типа Animal, в который запишите животных всех имеющихся у вас типов.
 * В цикле отправляйте их на прием к ветеринару.
 */

public class Animal {
    private String food;
    private String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getFood() {

        return food;
    }

    public String getLocation() {
        return location;
    }

    public Animal() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        return !(location != null ? !location.equals(animal.location) : animal.location != null);

    }

    @Override
    public int hashCode() {
        return location != null ? location.hashCode() : 0;
    }

    public void makeNoise() {
        System.out.println("smth");
    }

    public void eat() {
        System.out.println("Take to eat");
    }

    public void sleep() {
        System.out.println("Go to sleep");
    }
}
