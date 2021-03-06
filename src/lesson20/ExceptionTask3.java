package lesson20;

import lesson19.exceptionTask.WrongLoginException;
import lesson19.exceptionTask.WrongPasswordException;

/**
 * Переделываем задание используя multi-catch block.
 */
public class ExceptionTask3 {
    public static void main(String[] args) {
        System.out.println(authenticate("myLogin", "myPassword", "myPassword") + "\n");
        System.out.println(authenticate("myLoginmyLoginmyLoginmyLogin", "myPassword", "myPassword") + "\n");
        System.out.println(authenticate("myLogin", "myPasswordmyPasswordmyPasswordmyPassword", "myPasswordmyPasswordmyPasswordmyPassword") + "\n");
        System.out.println(authenticate("myLogin", "myPasswordmyPassword", "myPasswordPassword") + "\n");
    }

    private static boolean authenticate(String login, String password, String confPassword) {
        try {
            if (login.length() > 20) {
                throw new WrongLoginException(login, "Login is more than 20");
            }
            if (password.length() > 20 || !password.equals(confPassword)) {
                throw new WrongPasswordException("Password is incorrect");
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            System.out.println("Login " + login);
            System.out.println("Password " + password);
            System.out.println("Confirm Password " + confPassword);
        }
        return true;
    }
}
