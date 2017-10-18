package lesson11;

public class Liter {
    public static void main(String[] args) {
        Magazine vogue = new Magazine();
        Book novell = new Book();
        Printable book122 = new Book();

        Printable[] literature = {vogue, novell, book122};
        for (Printable texts : literature) {
            texts.print();
        }
        printMagazines(literature);
        printBooks(literature);
    }

    public static void printMagazines(Printable[] literature) {
        System.out.println("Печать после фильтра 1:");
        for (Printable texts : literature) {
            if (texts instanceof Magazine) {
                texts.print();
            }
        }
    }

    public static void printBooks(Printable[] literature) {
        System.out.println("Печать после фильтра 2:");
        for (Printable texts : literature) {
            if (texts instanceof Book) {
                texts.print();
            }
        }
    }
}