package lesson16;

import lesson11.Printable;

/**
 * Создать анонимный класс расширяющий интерфейс Printable.
 * Вызвать его метод print().
 */
public class PrintableDemo {
    public static void main(String[] args) {
        Printable printable = new Printable() {
            @Override
            public void print() {
                System.out.println("Printing from anonymous class");
            }
        };
        printable.print();
    }
}
