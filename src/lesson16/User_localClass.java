package lesson16;

/**
 *Переписать предыдущее задание, используя локальный класс.
 */
public class User_localClass {
    private String login;
    private String password;

    public User_localClass(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void createQuery() {
        class Query {
            public void printToLog() {
                System.out.println("Пользователь с логином и паролем " + login + " " + password + " отправил запрос");
            }
        }
        Query smth = new Query();
        smth.printToLog();
    }

    public static void main(String[] args) {
        User_localClass user1 = new User_localClass("Darya", "123");

        user1.createQuery();

    }
}


