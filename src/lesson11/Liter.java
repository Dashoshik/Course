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
    }
}
