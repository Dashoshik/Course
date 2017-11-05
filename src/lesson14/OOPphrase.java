package lesson14;
/**
*Напишите метод, заменяющий в строке все вхождения «object oriented programming»(не учитываем регистр символов) на «OOP».
*/
public class OOPphrase {
    public static void main(String[] args) {
    String s = "dkdhkjskj object oriented programming lxhjljhx obJEct orienteD progrAMMing jghzkdfhg kdhgkdjh kjdhkfh " ;
    changePhrase(s, "object oriented programming", "OOP");
    }

    private static void changePhrase(String text, String whatFind, String whatPaste) {
        StringBuilder result = new StringBuilder(text);
        String lowCase = text.toLowerCase();
        whatFind = whatFind.toLowerCase();
        int index;
        while ((index = lowCase.indexOf(whatFind)) >= 0) {
            result.replace(index, index + whatFind.length(), whatPaste);
            lowCase = result.toString().toLowerCase();
        }
        System.out.println(result.toString());
    }

}
