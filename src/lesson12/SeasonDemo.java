package lesson12;

/**
 *
 */
public class SeasonDemo {
    public static void main(String[] args) {
        Seasons favourite = Seasons.SUMMER;
        Seasons[] allSeasons = Seasons.values();
        System.out.println(favourite);
        definitionOfFavouriteSeason(favourite);
        cycleSeasons(allSeasons);
        mySeason();
    }

    static public void definitionOfFavouriteSeason(Seasons favourite) {
        switch (favourite) {

            case WINTER: {

                System.out.println("I like WINTER!");

                break;

            }

            case SPRING: {

                System.out.println("I like SPRING!");

                break;

            }

            case SUMMER: {

                System.out.println("I like SUMMER!");

                break;

            }
            case AUTUMN: {

                System.out.println("I like AUTUMN!");

                break;

            }
        }
    }

    static public void cycleSeasons(Seasons[] allSeasons) {
        for (Seasons c : allSeasons) {

            System.out.println(c);

        }
    }

    static public void mySeason() {

        Seasons vremyaGoda = Seasons.valueOf("SUMMER");

        System.out.println("Favourite season is a " + vremyaGoda);
    }
}