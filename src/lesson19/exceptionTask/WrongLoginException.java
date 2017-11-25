package lesson19.exceptionTask;

/**
 * Создать пользовательские классы исключения
 * WrongPasswordException и WrongLoginException
 * с двумя конструкторами – один по умолчанию,
 * второй принимает сообщение исключения и
 * передает его в конструктор класса Exception.
 */
public class
WrongLoginException extends Exception {
    private String login;

    public WrongLoginException() {
    }

    public WrongLoginException(String login, String message) {

        super(message);
        this.login = login;
    }
}
