import java.security.SecureRandom;

public class PasswordGenerator {
    private static final String LOWERCASE_CHARS = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL_CHARS = "!@#$%^&*()-_+=<>?";

    public static String generatePassword(int length, boolean includeLowercase, boolean includeUppercase, boolean includeDigits, boolean includeSpecialChars) {
        StringBuilder validChars = new StringBuilder();

        if (includeLowercase) {
            validChars.append(LOWERCASE_CHARS);
        }
        if (includeUppercase) {
            validChars.append(UPPERCASE_CHARS);
        }
        if (includeDigits) {
            validChars.append(DIGITS);
        }
        if (includeSpecialChars) {
            validChars.append(SPECIAL_CHARS);
        }

        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(validChars.length());
            password.append(validChars.charAt(randomIndex));
        }

        return password.toString();
    }

    public static void main(String[] args) {
        int passwordLength = 12;
        boolean includeLowercase = true;
        boolean includeUppercase = true;
        boolean includeDigits = true;
        boolean includeSpecialChars = true;

        String generatedPassword = generatePassword(passwordLength, includeLowercase, includeUppercase, includeDigits, includeSpecialChars);
        System.out.println("Generated Password: " + generatedPassword);
    }
}
