package lesson20;


import lesson19.exceptionTask.WrongLoginException;
import lesson19.exceptionTask.WrongPasswordException;

/**
 * Создать статический метод который принимает на вход три параметра: login, password и confirmPassword.
 * Длина login должна быть меньше 20 символов. Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.
 * Длина password должна быть меньше 20 символов. Также password и confirmPassword должны быть равны. Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
 * Метод не обрабатывает эти исключения.
 * Метод возвращает true, если значения верны или false в другом случае
 */
public class ExceptionTask {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        authenticate("myLogin", "myPassword", "myPassword");
        authenticate("myLoginmyLoginmyLoginmyLogin", "myPassword", "myPassword");
        authenticate("myLogin", "myPasswordmyPasswordmyPasswordmyPassword", "myPasswordmyPasswordmyPasswordmyPassword");
        authenticate("myLogin", "myPasswordmyPassword", "myPasswordPassword");
    }

    private static boolean authenticate(String login, String password, String cofPassword)
            throws WrongLoginException, WrongPasswordException {
        if (login.length() > 20) {
            throw new WrongLoginException(login, "Login is more than 20");
        }
        if (password.length() > 20 || !password.equals(cofPassword)) {
            throw new WrongPasswordException("Password is more that 20");
        }
        return true;
    }
}
