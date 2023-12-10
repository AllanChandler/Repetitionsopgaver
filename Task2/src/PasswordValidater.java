public class PasswordValidater {

    int minLength;
    int maxLength;
    boolean numbersRequired;
    boolean UpperCase;

    PasswordValidater(int minLength, int maxLength, boolean numbersRequired, boolean UpperCase) {

        this.minLength = minLength;
        this.maxLength = maxLength;
        this.numbersRequired = numbersRequired;
        this.UpperCase = UpperCase;
    }

    public boolean isValid(String password) {


        if (password.length() < minLength || password.length() > maxLength) {
            return false;
        }
        if (numbersRequired) {
            boolean Number = false;
            for (char a : password.toCharArray()) {
                if (Character.isDigit(a)) {
                    Number = true;
                    break;

                }

            }

            if (!Number) {
                return false;
            }
        }


        if (UpperCase) {
            boolean Uppercase = false;
            boolean Lowercase = false;

            for (char a : password.toCharArray()) {
                if (Character.isUpperCase(a)) {
                    Uppercase = true;
                }

                if (Character.isLowerCase(a)) {
                    Lowercase = true;
                }

                if (Uppercase && Lowercase) {
                    break;
                }
            }

            if (!Uppercase || !Lowercase) {
                return false;
            }
        }

        return true;
    }
}







