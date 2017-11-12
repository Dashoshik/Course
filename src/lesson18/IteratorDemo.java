package lesson18;

import lesson17.box.HeavyBox;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Создать коллекцию, содержащую объекты HeavyBox.
 * Написать метод, который перебирает элементы коллекции и проверяет вес коробок. Если вес коробки
 * больше 300 г, коробка перемещается в другую коллекцию.
 */
public class IteratorDemo {
    public static void main(String[] args) {

        Queue<HeavyBox> queue1 = new PriorityQueue<>();
        queue1.offer(new HeavyBox(2, 8, 6, 1200));
        queue1.offer(new HeavyBox(4, 9, 2, 12));
        queue1.offer(new HeavyBox(6, 5, 7, 10));
        queue1.offer(new HeavyBox(16, 28, 26, 350));
        System.out.println("Первоначальная коллекция: " + queue1);
        changeCollection(queue1);
    }

    private static void changeCollection(Queue<HeavyBox> queue1) {
        Queue<HeavyBox> sortedQueue = new PriorityQueue<>();
        Iterator<HeavyBox> iterator = queue1.iterator();
        while (iterator.hasNext()) {
            HeavyBox currentBox = iterator.next();
            if (currentBox.getWeight() > 300) {
                sortedQueue.offer(currentBox);
                iterator.remove();
            }
        }
        System.out.println("Вторая коллекция, где хранятся коробки более 300 грамм - " + sortedQueue);
    }
}
