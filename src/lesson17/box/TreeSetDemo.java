package lesson17.box;

import java.util.TreeSet;

/**
 * Created by student on 12.11.2017.
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<HeavyBox> boxSet = new TreeSet<>();
        boxSet.add(new HeavyBox(2, 8, 6, 10));
        boxSet.add(new HeavyBox(4, 9, 2, 12));
        boxSet.add(new HeavyBox(6, 5, 7, 10));
        boxSet.add(new HeavyBox(16, 28, 26, 30));
        for (HeavyBox box : boxSet) {
            System.out.println(box);
        }
    }
}
