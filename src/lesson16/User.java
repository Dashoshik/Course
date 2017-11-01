package lesson16;

/**
 * Создать класс User, содержащий private переменные login, password.
 * Создать внутренний класс Query в классе User.
 * Класс Query содержит метод printToLog(), который распечатывает на консоль сообщение о том что пользователь
 * с таким то логином и паролем отправил запрос.
 * Класс User, содержит метод createQuery(), в котором создается объект класса Query и вызывается метод printToLog().
 * В методе main():
 * создать экземпляр класса User  и вызвать метод createQuery();
 * создать экземпляр класса Query и вызвать метод printToLog() используя конструкцию user.new Query();
 * создать экземпляр класса Query и вызвать метод printToLog() используя конструкцию new User().new Query();
 */
public class User {
    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public class Query {
        public void printToLog() {
            System.out.println("Пользователь с логином" + login + password + "отправил запрос");
        }
    }

    public void createQuery() {
        Query smth = new Query();
        smth.printToLog();
    }

    public static void main(String[] args) {
        User user1 = new User("Darya", "123");
        Query query1 = user1.new Query();
        Query query2 = new User("Maria", "569").new Query();
        user1.createQuery();
        query1.printToLog();
        query2.printToLog();
    }

}
