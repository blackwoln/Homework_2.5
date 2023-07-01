public class Main {
    public static void main(String[] args) {
        String login = "java_skypro_go";
        String password = "D_1hWiKjjP_9";
        String confirmPassword = "D_1hWiKjjP_9";

        try {
            UserValidator.validateUser(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}