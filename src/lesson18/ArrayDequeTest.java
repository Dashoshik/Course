package lesson18;

import lesson17.box.HeavyBox;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Создать очередь, содержащую объекты класса HeavyBox.
 * Используем класс ArrayDeque. Поместить объекты в очередь с помощью метода offer().
 * Удалить объекты методом poll().
 */
public class ArrayDequeTest {
    public static void main(String[] args) {
        Deque<HeavyBox> meanings = new ArrayDeque<>();
        meanings.offer(new HeavyBox(2, 8, 6, 10));
        meanings.offer(new HeavyBox(4, 9, 2, 12));
        meanings.offer(new HeavyBox(6, 5, 7, 10));
        meanings.offer(new HeavyBox(16, 28, 26, 30));
        while (!meanings.isEmpty()) {
            System.out.println(meanings.poll() + " ");
        }
    }
}
