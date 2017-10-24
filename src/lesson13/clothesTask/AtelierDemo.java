package lesson13.clothesTask;

public class AtelierDemo {
    public static void main(String[] args) {
        Shirt t_shirt = new Shirt();
        Pants manPants = new Pants();
        Pants womanPants = new Pants();
        Skirt longSkirt = new Skirt();
        Tie yellowTie = new Tie();
        Clothes[] allTypeOfClothes = {t_shirt, manPants, womanPants, longSkirt, yellowTie};
        for (Clothes odezhda : allTypeOfClothes) {
            System.out.println(odezhda);
        }
    }

    public static void toDressWoman(Clothes[] allTypeOfClothes) {
        for (Clothes odezhda : allTypeOfClothes) {
            if (odezhda instanceof WomanClothes) {
                ((WomanClothes) odezhda).toDressWoman();
            }
        }
    }

    public static void toDressMan(Clothes[] allTypeOfClothes) {
        for (Clothes odezhda : allTypeOfClothes) {
            if (odezhda instanceof ManClothes) {
                ((ManClothes) odezhda).toDressMan();
            }
        }
    }
}
