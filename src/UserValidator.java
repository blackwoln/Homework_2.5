public class UserValidator {
    public static void validateUser(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        validateLogin(login);
        validatePassword(password);
        validatePasswordMatch(password, confirmPassword);
    }

    private static void validateLogin(String login) throws WrongLoginException {
        if (login.length() > 20 || !login.matches("[a-zA-Z0-9_]+")) {
            throw new WrongLoginException("Неверный логин");
        }
    }

    private static void validatePassword(String password) throws WrongPasswordException {
        if (password.length() > 20 || !password.matches("[a-zA-Z0-9_]+")) {
            throw new WrongPasswordException("Неверный пароль");
        }
    }

    private static void validatePasswordMatch(String password, String confirmPassword) throws WrongPasswordException {
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают");
        }
    }
}
