public class Main {
    public static void main(String[] args) {


        PasswordValidater passwordValidater = new PasswordValidater(11, 12, true, true);
        String password = "PassWord123";
        boolean isValidPassword = passwordValidater.isValid(password);
        System.out.println("Is the password valid? " + isValidPassword);

    }
}