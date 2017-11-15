package lesson19.exceptionTask;

/**
 * Создать пользовательские классы исключения
* WrongPasswordException и WrongLoginException
* с двумя конструкторами – один по умолчанию,
 *второй принимает сообщение исключения и
 *передает его в конструктор класса Exception.
 */
public class WrongPasswordException extends Exception {

    public WrongPasswordException() {
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
