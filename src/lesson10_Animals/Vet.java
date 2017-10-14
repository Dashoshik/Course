package lesson10_Animals;

public class Vet {
    public static void main(String[] args) {
        Cat kitten = new Cat("fish", "Kharkov", "fluffy");
        Dog pet = new Dog("bones", "Kharkov");
        Horse pony = new Horse("no information", "Kharkov");
        Cat kot = new Horse("milk", "Kharkov", "British");
        Animal[] animalsClients = new Animal[4] {
            animalsClients[0] = kitten;
            animalsClients[1] = pet;
            animalsClients[2] = pony;
            animalsClients[3] = kot;

            for (visitor:
                 animalsClients) {
                System.out.println("Заходите");
            }


        public void treatAnimal (Animal animal){
            System.out.println();
        }



    }
    }