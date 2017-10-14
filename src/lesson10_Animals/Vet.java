package lesson10_Animals;

public class Vet {
    public static void main(String[] args) {
        Cat kitten = new Cat("fish", "Kharkov", "fluffy");
        Dog pet = new Dog("bones", "Kharkov", "someSecurityGuard");
        Horse pony = new Horse("no information", "Kharkov", "someBreed");
        Cat kot = new Cat("milk", "Kharkov", "British");
        Animal[] animalsClients = new Animal[]{kitten, pet, pony, kot};

        for (Animal visitor : animalsClients) {
            System.out.println("Заходите" );
        }
    }

    public void treatAnimal(Animal animal) {
        System.out.println();
    }
}