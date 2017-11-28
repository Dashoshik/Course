package lesson16;

/**
 * Переписать класс Query используя статический класс.
 */
public class QueryStatic {
    private static String login = "someLogin";
    private static String password = "somePassword";

    static class Query {
        public void printToLog() {
            System.out.println("Пользователь с логином" + login + password + "отправил запрос");
        }
    }

    public void createQuery() {
        Query smth = new Query();
        smth.printToLog();
    }

    public static void main(String[] args) {
        QueryStatic user1 = new QueryStatic();
        Query query1 = new QueryStatic.Query();

        user1.createQuery();
        query1.printToLog();

    }

}

