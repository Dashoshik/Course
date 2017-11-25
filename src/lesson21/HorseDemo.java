package lesson21;

import lesson10_Animals.Halter;
import lesson10_Animals.Horse;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Создайте метод, который сериализует класс Horse(наследник Animal) в файл и метод, который десериализует его.
 */
public class HorseDemo implements Serializable {
    public static void main(String[] args) {
        Horse d = new Horse("food", "location", "breed");
        d.setHalter(new Halter());
        try {
            FileOutputStream fs = new FileOutputStream("src/lesson21/testSer.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(d);
            os.close();
        } catch (Exception e)

        {
            e.printStackTrace();
        }
    }
}
