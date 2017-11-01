package lesson16;

/**
 * Переписать класс Query используя статический класс.
 */
public class QueryStatic {
    private static String login;
    private static String password;

    public QueryStatic(String login, String password) {
        this.login = login;
        this.password = password;
    }

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
        QueryStatic user1 = new QueryStatic("Darya", "123");
        Query query1 = new QueryStatic.Query();

        user1.createQuery();
        query1.printToLog();

    }

}

