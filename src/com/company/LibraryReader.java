package com.company;

public class LibraryReader {
    String name;
    int numberTicket;
    String faculty;
    String dateOfBirth;
    long phoneNumber;

    LibraryReader() {

    }


    public static void main(String args[]) {
        LibraryReader reader1 = new LibraryReader();
        LibraryReader reader2 = new LibraryReader();
        String infoReader[][] = {
                {"Kate", "RT-2506", "economic", "10.05.1999", "096-74-65-222"},
                {"John", "OP - 3296", "economic", "01.08.1998", "050-98-42-379"},

        };
        System.out.println(infoReader);
    }

}